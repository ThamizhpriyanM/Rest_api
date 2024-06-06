package com.ltp.contacts.service;

import com.ltp.contacts.pojo.Contact;

import java.util.List;

public interface ContactService {
    Contact getContactById(String id);
    void saveContact(Contact contact);
    void putContact(String id, Contact contact);
    Contact delete(String id);
    List<Contact> allId();
    
}
