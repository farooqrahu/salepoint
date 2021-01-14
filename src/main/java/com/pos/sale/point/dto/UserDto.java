package com.pos.sale.point.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String username;
    private String email;
    private String phoneNo;
    private String employeeId;
    private String designation;
    private String password;
    private Boolean isActive;
    private Boolean closed;

    public UserDto() {
        System.out.println("User Dto Constructor called");
    }

    public UserDto(String id, String name, String username, String email, String phoneNo, String employeeId, String designation, String password, Boolean isActive, Boolean closed) {

        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.designation = designation;
        this.password = password;
        this.isActive = isActive;
        this.closed = closed;
    }

    @PostConstruct
    public void init() {
        System.out.println("UserDto::::PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("UserDto::::PreDestroy");
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }
}
