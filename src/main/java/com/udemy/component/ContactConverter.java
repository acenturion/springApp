/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.component;

import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;
import org.springframework.stereotype.Component;

/**
 *
 * @author Minimal
 */
@Component("contactConverter")
public class ContactConverter {

    public Contact convertContactModel2Contact(ContactModel contactModel) {
        Contact contact = new Contact();
        contact.setCity(contactModel.getCity());
        contact.setFirstname(contactModel.getFirstname());
        contact.setId(contactModel.getId());
        contact.setLastname(contactModel.getLastname());
        contact.setTelephone(contactModel.getTelephone());
        return contact;
    }

    public ContactModel convertContac2ContactModel(Contact contact) {
        ContactModel contactModel = new ContactModel();

       
        contactModel.setCity(contact.getCity());
        contactModel.setFirstname(contact.getFirstname());
        contactModel.setId(contact.getId());
        contactModel.setLastname(contact.getLastname());
        contactModel.setTelephone(contact.getTelephone());
        
        return contactModel;
    }
}
