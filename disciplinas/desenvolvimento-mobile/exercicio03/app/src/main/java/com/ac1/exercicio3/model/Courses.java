package com.ac1.exercicio3.model;

public class Courses {

    private int id;
    private String name;
    private double value;
    private String days;

    public Courses() {}

    public Courses(int id, String name, double value, String days) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.days = days;
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}
