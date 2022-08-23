package com.contact.service;

import com.contact.entity.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    Optional<Contact> getContactOfUser(Long cId);

    public Contact register(Contact contact);

    public List<Contact> getContactByUserId(Long userId);


    void deleteContactById(Long userId);
}
