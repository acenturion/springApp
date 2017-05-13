/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.controller;

import com.udemy.constant.ViewConstant;
import com.udemy.model.ContactModel;
import com.udemy.services.ContactService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Minimal
 */
@Controller
@RequestMapping("/contacts")
public class ContactController {

    private static final Log LOG = LogFactory.getLog(ContactController.class);
    @Autowired
    @Qualifier("contactServiceImpl")
    private ContactService contactService;

    @GetMapping("/cancel")
    public String cancel() {
         return "redirect:/contacts/showcontacts";

    }

    @GetMapping("/contactform")
    private String redirectContactForm(Model model) {
        model.addAttribute("contactModel", new ContactModel());
        return ViewConstant.CONTACT_FORM;
    }

    @PostMapping("/addcontact")
    public String addContact(@ModelAttribute(name = "contactModel") ContactModel contactModel, Model model) {

        LOG.info("METHOD: showLoginForm() -- PARAMS:" + contactModel.toString());

        if (null != contactService.addContact(contactModel)) {

            model.addAttribute("result", 1);
        } else {
            model.addAttribute("result", 0);
        }
         return "redirect:/contacts/showcontacts";
    }
    @GetMapping("/showcontacts")
    public ModelAndView showContacts(){
        ModelAndView mav = new ModelAndView(ViewConstant.CONTACTS);
        mav.addObject("contacts", contactService.listAllContacts());
        return mav;
    }
}