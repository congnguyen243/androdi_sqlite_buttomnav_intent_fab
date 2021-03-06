package com.example.sqlitedemo.model;

import java.io.Serializable;

public class Cong implements Serializable {
    private int id;
    private String name;
    private boolean gender;
    private double mark;

    public Cong() {
    }

    public Cong(String name, boolean gender, double mark) {
        this.name = name;
        this.gender = gender;
        this.mark = mark;
    }

    public Cong(int id, String name, boolean gender, double mark) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.mark = mark;
    }

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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
