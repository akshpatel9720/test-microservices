package com.contact.service;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<Contact> getContactOfUser() {
        List<Contact> contacts= contactRepository.findAll();
        return contacts;
    }

    @Override
    public Contact register(Contact contact)
    {
     Contact contact1=contactRepository.save(contact);
     return contact1;
    }


}
