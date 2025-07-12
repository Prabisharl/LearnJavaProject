package org14.example.filehandling.serialization;

import lombok.ToString;

import java.io.Serializable;


public class Employee implements Serializable {
    private static final long serialVersionUID=1L;
    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
