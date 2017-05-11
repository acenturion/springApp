/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.services;

import com.udemy.model.Person;
import java.util.List;

/**
 *
 * @author AlejandroThalamus
 */
public interface EjemploServicio {
    public abstract List<Person> getListPeople();
}
