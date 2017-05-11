/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author AlejandroThalamus
 */
@ControllerAdvice

public class ErrorsController {

    public static final String ISE_VIEW = "error/500";

    @ExceptionHandler(Exception.class)
     

    public String showInternalServerError() {
        return ISE_VIEW;
    }
}
