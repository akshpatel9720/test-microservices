package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    public Long userId;
    public String name;
    private String cid;
    private List<String> phoneNo;

    private List<String> email;

    public List<String> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<String> phoneNo) {
        this.phoneNo = phoneNo;
    }


    public List<Contact> contacts = new ArrayList<>();

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public UserDTO(Long userId, String name, String cid, List<Contact> contacts) {
        this.userId = userId;
        this.name = name;
        this.cid = cid;
        this.contacts = contacts;
    }

    public UserDTO() {
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", cid='" + cid + '\'' +
                ", contacts=" + contacts +
                '}';
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }
}
