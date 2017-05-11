/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.controller;

import com.udemy.model.Person;
import javax.validation.Valid;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author AlejandroThalamus
 */
@Controller
@RequestMapping("/ejemplo3")
public class ejemplo3Controler {

    private static final Log LOGGER = LogFactory.getLog(ejemplo3Controler.class);

    public static final String FORM_VIEW = "form";
    public static final String RESULT_VIEW = "result";

//    @GetMapping("/")
//    public String redirect(){
//        return "redirect:/ejemplo3/showform";
//    }
    @GetMapping("/")
    public RedirectView redirect() {
        return new RedirectView("/ejemplo3/showform");
    }

    @GetMapping("/showform")
    public String showForm(Model model) {
        LOGGER.info("INFO TRACE");
        LOGGER.info("WARNIG TRACE");
        LOGGER.info("ERROR TRACE");
        LOGGER.info("DEBUG TRACE");
        model.addAttribute("person", new Person());
        return FORM_VIEW;
    }

    @PostMapping("/addperson")
    public ModelAndView addPerson(@Valid @ModelAttribute("person") Person person, BindingResult bindingResult) {
        ModelAndView mav = new ModelAndView();
        if (bindingResult.hasErrors()) {
            mav.setViewName(FORM_VIEW);
        } else {
            mav.setViewName(RESULT_VIEW);
            mav.addObject("person", person);
        }
        return mav;
    }
}
