package com.selva.travelcalendar.service;

import java.util.List;

import com.selva.travelcalendar.model.Contact;

public interface IContactService {
    Contact addContact(Contact c);
    List<Contact> getContacts();
}
