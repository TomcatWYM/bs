package com.bs.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * 用户，，老师，学生
 * @author Administrator
 *
 */
 
@Component
public class User implements Serializable{

    private Integer userId;
    private String username;
    private String name;
    private String email;
    private String password;

    private String userType;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
