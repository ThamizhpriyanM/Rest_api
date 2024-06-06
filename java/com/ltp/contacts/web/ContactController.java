package com.ltp.contacts.web;

import com.ltp.contacts.pojo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.ltp.contacts.service.ContactService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    
    @Autowired
    private ContactService contactService;

    @GetMapping("/contact/all")
    public ResponseEntity<List<Contact>> allId(){
        List<Contact> contact = contactService.allId();
        return new ResponseEntity<>(contact,HttpStatus.OK);
    }

    @GetMapping("/contact/{id}")
    public ResponseEntity<Contact> getContact(@PathVariable String id){
        Contact contact = contactService.getContactById(id);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PostMapping("/contact")
    public ResponseEntity<HttpStatus> createContact(@RequestBody Contact contact){
        contactService.saveContact(contact);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/contact/{id}")
    public ResponseEntity<Contact> update(@PathVariable String id,@RequestBody Contact contact){
        contactService.putContact(id,contact);
        return new ResponseEntity<>(contactService.getContactById(id),HttpStatus.OK);
    }
    @DeleteMapping("/contact/{id}")
    public ResponseEntity<Contact> deleteContact(@PathVariable String id){
        Contact contact = contactService.delete(id);
        return new ResponseEntity<>(contact,HttpStatus.NO_CONTENT);
    }
}

