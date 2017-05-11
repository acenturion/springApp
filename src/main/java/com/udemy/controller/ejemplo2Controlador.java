/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author AlejandroThalamus
 */
@Controller
@RequestMapping("/ejemplo2")
public class ejemplo2Controlador {
    private static final String EXAMPLE_VIEW = "ejemplo2";
    
    @GetMapping("/request2/{nm}")
    public ModelAndView request2(@PathVariable("nm") String name){
        ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
        
        mav.addObject("nm_in_model",name);
        return mav;
    }
}
