package com.ltp.contacts.pojo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Contact {

    private String id;
    private String name;
    private String phoneNumber;


//    public Contact(String id, String name, String phoneNumber) {
//        this.id = id;
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//    }

    public Contact() {
        this.id = UUID.randomUUID().toString();
    }

}
