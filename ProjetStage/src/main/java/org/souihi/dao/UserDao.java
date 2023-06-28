package org.souihi.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;

import javax.persistence.Entity;



@Entity
public class UserDao extends PanacheEntity {
    @NotNull
    public Long id;
    @NotNull
    public String firstName;
    @NotNull
    public String lastName;
    @NotNull
    public String email;
    @NotNull
    public String password;
    @NotNull
    public String phoneNumber;
    @NotNull
    public String roleId;
    public UserDao() {
    }

    //CONSTRUCTOR


    public UserDao(String firstName, String lastName, String email, String password, String phoneNumber, String roleId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.roleId = roleId;
    }


    //GETTER AND SETTER
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoleId() {
        return roleId;
    }
}



