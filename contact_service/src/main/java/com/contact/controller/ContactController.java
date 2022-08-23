package com.contact.controller;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/getById")
    public Optional<Contact> getContact(@RequestParam("cId") Long cId) {
        return contactService.getContactOfUser(cId);
    }

    @PostMapping("/saveUser")
    public Contact register(@RequestBody Contact contact) {
        return contactService.register(contact);
    }

    @GetMapping("/getContactByUserId")
    public List<Contact> getContactByUserId(@RequestParam("userId") Long userId) {
        return contactService.getContactByUserId(userId);
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteContactByUserId(@PathVariable("userId") Long userId) {
        contactService.deleteContactById(userId);
    }
}
