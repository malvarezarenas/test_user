package com.example.users.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    @Email(message = "email invalido", regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Phone> phones;

    @Temporal(TemporalType.TIMESTAMP)
    public Date created = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    public Date modified = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    public Date last_login = new Date();

/*
    public String getName() {
        return name;
    }
*/
    public void setName(String name) {
        this.name = name;
    }
/*
    public String getEmail() {
        return email;
    }
*/
    public void setEmail(String email) {
        this.email = email;
    }
/*
    public String getPassword() {
        return password;
    }*/

    public void setPassword(String password) {
        this.password = password;
    }
/*
    public List<Phone> getPhones() {
        return phones;
    }
*/
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
        //phones.forEach(phone -> phone.setUser(this));
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
