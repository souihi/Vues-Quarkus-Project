package org.souihi.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import io.smallrye.common.constraint.NotNull;

import javax.persistence.Entity;

@Entity
public class SpaceDao extends PanacheEntity {
    @NotNull
    public String name;
    @NotNull
    public String descritpion;
    @NotNull
    public String adress;
    @NotNull
    public String city;
    @NotNull
    public String country;
    @NotNull
    public String zipCode;
    @NotNull
    public String capacity;
    @NotNull
    public String type;
    @NotNull
    public String ameneties;
    @NotNull
    public String image;
    @NotNull
    public String userId;

    public SpaceDao() {
    }
    //CONSTRUCTOR
    public SpaceDao(String name, String descritpion, String adress, String city, String country, String zipCode, String capacity, String type, String ameneties, String image, String userId) {
        this.name = name;
        this.descritpion = descritpion;
        this.adress = adress;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.capacity = capacity;
        this.type = type;
        this.ameneties = ameneties;
        this.image = image;
        this.userId = userId;
    }
    //GETTER AND SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmeneties() {
        return ameneties;
    }

    public void setAmeneties(String ameneties) {
        this.ameneties = ameneties;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
