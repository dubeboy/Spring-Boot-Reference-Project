package com.mike.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

/*
This is an example of a POJO class that will be used to represent a table found in a database.
Using specific annotations, we can mark the class as a database entity, and have a lot of auto configuration happen for us.
In this case, Spring Boot will create a matching table for us, with an autogenerated ID and versioning.
Versioning is a method of preventing users from overriding each other's changes in the DB.
 */

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String pseudonym;
    private String name;
    private String surname;
    private Integer age;

    public Author() {}

    public Author(Integer version, String pseudonym, String name, String surname, Integer age) {
        this.version = version;
        this.pseudonym = pseudonym;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
