/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.controller;

import com.udemy.component.EjemploComponent;
import com.udemy.model.Person;
import com.udemy.services.EjemploServicio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author AlejandroThalamus    
 */
@Controller
@RequestMapping("/ejemplo")
public class ejemploController {

    @Autowired
    @Qualifier("ejemploServicio")
    private  EjemploServicio ejemploServicio;

    @Autowired
    @Qualifier("ejemploComponent")
    private EjemploComponent exampleComponent;

    @GetMapping("ejemploString")
    public String ejemploString(Model model) {
        exampleComponent.sayHello();
        model.addAttribute("people", ejemploServicio.getListPeople());
        return "ejemplo";
    }

}
