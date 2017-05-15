/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.services;


import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;
import java.util.List;

/**
 *
 * @author Minimal
 */
public interface ContactService {

    public abstract ContactModel addContact(ContactModel contactModel);
    public abstract  List<ContactModel> listAllContacts();
    
    public abstract Contact findContactById(int id);
    
    public abstract void removeContact(int id);
    
    public abstract  ContactModel findContactByIdModel(int id);
}
