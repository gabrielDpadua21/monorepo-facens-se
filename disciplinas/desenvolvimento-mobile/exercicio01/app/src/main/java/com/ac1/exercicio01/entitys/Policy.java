package com.ac1.exercicio01.entitys;

public class Policy {

    private long number;
    private String name;
    private int age;
    private char sex;
    private double carValue;

    public Policy() {}

    public Policy(long number, String name, int age, char sex, double carValue) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.carValue = carValue;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getCarValue() {
        return carValue;
    }

    public void setCarValue(double carValue) {
        this.carValue = carValue;
    }

    public double calculateValue() {
        if(this.sex == 'F') return carValue * 2 / 200;
        if(this.sex == 'M' && this.age > 25) return carValue * 5 / 100;
        return carValue * 10 / 100;
    }
}
