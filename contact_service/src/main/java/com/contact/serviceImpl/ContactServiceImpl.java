package com.contact.serviceImpl;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    public ContactRepository contactRepository;

//    List<Contact> list= List.of(
//        new Contact(1L,"akshpatel9720@gmail.com","aksh",1111L),
//            new Contact(2L,"akshpatel9720@gmail.com","aksh",1111L),
//            new Contact(3L,"sahil@gmail.com","sahil",2222L),
//            new Contact(4L,"hardik@gmail.com","hardik",3333L)
//    );

    @Override
    public Optional<Contact> getContactOfUser(Long cId) {
        Optional<Contact> contact = contactRepository.findById(cId);
        return contact;
    }

    @Override
    public Contact register(Contact contact) {
        return contactRepository.save(contact);
//        return contact1;
    }

    @Override
    public List<Contact> getContactByUserId(Long userId) {
        return contactRepository.findByUserId(userId);
    }

    @Override
    public void deleteContactById(Long userId) {
        contactRepository.deleteContactById(userId);
    }


}
