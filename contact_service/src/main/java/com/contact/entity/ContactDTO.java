package com.contact.entity;

import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.List;

public class ContactDTO {
    private Long cId;
    private String email;
    private String contactName;

    private String phoneNo;
    private Long userId;

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public ContactDTO(Long cId, String email, String contactName, String phoneNo, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.phoneNo = phoneNo;
        this.userId = userId;
    }

    public ContactDTO() {
    }

    @Override
    public String toString() {
        return "ContactDTO{" +
                "cId=" + cId +
                ", email='" + email + '\'' +
                ", contactName='" + contactName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", userId=" + userId +
                '}';
    }
}
