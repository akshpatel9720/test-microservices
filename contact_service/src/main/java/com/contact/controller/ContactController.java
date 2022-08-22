package com.contact.controller;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/getAllUser")
    public List<Contact> getContact() {
        return contactService.getContactOfUser();
    }

    @PostMapping("/saveUser")
    public Contact register(@RequestBody Contact contact){
        return contactService.register(contact);
    }
}
