package com.ltp.contacts.service;

import java.util.List;
import java.util.stream.IntStream;

import com.ltp.contacts.pojo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.contacts.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact getContactById(String id){
        return contactRepository.getContact(findIndexById(id));
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.saveContact(contact);
    }

    @Override
    public void putContact(String id, Contact contact) {
        contactRepository.updateContact(findIndexById(id),contact);
    }

    @Override
    public Contact delete(String id) {
        contactRepository.deleteContact(findIndexById(id));
        return null;
    }

    @Override
    public List<Contact> allId() {
        return contactRepository.getContacts();
    }

    private int findIndexById(String id) {
        return IntStream.range(0, contactRepository.getContacts().size())
            .filter(index -> contactRepository.getContacts().get(index).getId().equals(id))
            .findFirst()
            .orElseThrow();
    }

}
