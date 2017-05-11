/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.controller;

import com.udemy.entity.Curso;
import com.udemy.services.CursoServicio;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author AlejandroThalamus
 */
@Controller
@RequestMapping("/cursos")
public class CursoController {

    private static final String CURSOS_VIEW = "cursos";
    private static final Log LOG = LogFactory.getLog(CursoController.class);
    @Autowired
    @Qualifier("cursoServicioImpl")
    private CursoServicio cursoServicio;
    
    @GetMapping("/listcursos")
    public ModelAndView listAllCursos() {
        ModelAndView mav = new ModelAndView(CURSOS_VIEW);
        LOG.info("Call: "+"listAllCursos()");
        mav.addObject("curso", new Curso());
        mav.addObject("cursos", cursoServicio.listaAllCursos());
        return mav;
    }
    
    @PostMapping("/addcurso")
    public String addCurso(@ModelAttribute("curso") Curso curso){
         LOG.info("Call: "+" addCurso() -- Param: "+ curso.toString());
            cursoServicio.addCurso(curso);
       return "redirect:/cursos/listcursos";
    }
}
