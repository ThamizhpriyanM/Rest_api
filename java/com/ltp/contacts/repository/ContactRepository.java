package com.ltp.contacts.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import org.springframework.stereotype.Repository;

import com.ltp.contacts.pojo.Contact;

@Getter
@Repository
public class ContactRepository {
    
    private List<Contact> contacts = new ArrayList<>();

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public void saveContact(Contact contact) {
        contacts.add(contact);
    }

    public void updateContact(int index, Contact contact) { 
        contacts.set(index, contact); 
    }
    
    public void deleteContact(int index) {
        contacts.remove(index);
    }

    public List<Contact> getContacts() { return contacts; }
}
