package com.megmatic.springbootrestapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cat")
public class Cat {

    // DATA

    @Id
    @GeneratedValue
    private int id;
    private String name;

    // CONSTRUCTORS

    public Cat() {}

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }


    // ACCESSORS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}