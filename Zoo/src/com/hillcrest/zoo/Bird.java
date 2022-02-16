package com.hillcrest.zoo;

public abstract class Bird extends Animal{

private boolean canFly;
    public Bird(double weight, int age, double length, String color, boolean canFly) {
        super(weight, age, length, color);
        this.canFly=canFly;
    }
}
