/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.services.impl;

import com.udemy.model.Person;
import com.udemy.services.EjemploServicio;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author AlejandroThalamus
 */
@Service("ejemploServicio")
public class EjemploServicioImpl implements EjemploServicio {
    private static final Log LOG = LogFactory.getLog(EjemploServicioImpl.class);
    @Override
    public List<Person> getListPeople() {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Sapo", 15));
        people.add(new Person("Carlos", 15));
        people.add(new Person("Pepe", 15));
        people.add(new Person("Pin", 15));
        people.add(new Person("Pum", 15));
        LOG.info("Mensaje desde SERVICIO");
        return people;

    }

}
