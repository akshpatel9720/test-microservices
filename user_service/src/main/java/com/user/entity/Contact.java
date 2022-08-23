package com.user.entity;

public class Contact {
    private String cId;
    private String email;
    private String contactName;

    private String phoneNo;

    private Long userId;

    public Contact(String cId, String email, String contactName, Long userId) {
        this.cId=cId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
        this.phoneNo=phoneNo;
    }

    public Contact() {
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}
