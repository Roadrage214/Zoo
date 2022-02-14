package com.hillcrest.zoo;

public abstract class Animal {

    private double weight;
    private int age;
    private double length;
    private String color;

    public Animal(double weight, int age, double length, String color) {
        this.weight = weight;
        this.age = age;
        this.length = length;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public abstract String eat (String food);

    public abstract String sleep();

    public String move() {
        return "moving...";
    }

    public abstract String doSomething();
}
