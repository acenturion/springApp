/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.controller;

import com.udemy.constant.ViewConstant;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Minimal
 */
@Controller
public class LoginController {

    private static final Log LOG = LogFactory.getLog(LoginController.class);

   
    @GetMapping("/login")
    public String showLoginForm(Model model,
            @RequestParam(name = "error", required = false) String error, @RequestParam(name = "logout", required = false) String logout) {
        LOG.info("METHOD: showLoginForm() -- PARAMS: error:" + error + ", Logout: " + logout);
        model.addAttribute("error", error);
        model.addAttribute("logout", logout);
       
        return ViewConstant.LOGIN;
    }

    @GetMapping({"/loginsuccess", "/"})
    public String loginCheck() {
        LOG.info("METHOD: loginCheck()");
        return "redirect:/contacts/showcontacts";

    }
}
