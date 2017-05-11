/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author AlejandroThalamus
 */
@Component("ejemploComponent")
public class EjemploComponent {

    private static final Log LOG = LogFactory.getLog(EjemploComponent.class);

    public void sayHello() {
        LOG.info("Mensaje desde COMPONENT");

    }
}
