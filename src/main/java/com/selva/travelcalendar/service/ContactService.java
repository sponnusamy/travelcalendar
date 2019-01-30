package com.selva.travelcalendar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selva.travelcalendar.model.Contact;
import com.selva.travelcalendar.repo.ContactRepository;

@Service
public class ContactService implements IContactService {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }
}
