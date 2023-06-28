package org.souihi.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;

import javax.persistence.Entity;


@Entity
public class RoleDao extends PanacheEntity {


    @NotNull
    public String role;
    public RoleDao(){}
    //CONSTRUCTOR
    public RoleDao(String role){
        this.role = role;
    }

    //GETTER AND SETTER
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
