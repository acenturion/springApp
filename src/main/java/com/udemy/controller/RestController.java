/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.controller;

import com.udemy.model.ContactModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author AlejandroThalamus
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
    @GetMapping("/checkrest")
    public ResponseEntity<ContactModel> checkRest(){
        ContactModel cm = new ContactModel(3,"Carlos","Juan","4564654","Bsas");
        return new ResponseEntity<ContactModel>(cm, HttpStatus.OK);
    }
}
