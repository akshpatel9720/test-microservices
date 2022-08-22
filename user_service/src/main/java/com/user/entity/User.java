package com.user.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String name;

    private String cid;

    public User(Long userId, String name, String phone, String cid) {
        this.userId = userId;
        this.name = name;

        this.cid=cid;
    }

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;

    }

    public User() {
    }

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
}
