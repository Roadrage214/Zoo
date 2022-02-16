package com.hillcrest.zoo;

public class Parakeet extends Bird{

    public Parakeet(double weight, int age, double length, String color) {
        super(weight, age, length, color, true);
    }

    @Override
    public String eat(String food) {
        food="Seeds, Fruits, Nuts";
        return null;
    }

    @Override
    public String sleep() {
        System.out.println("12 hours");
        return null;
    }

    @Override
    public String doSomething() {
        System.out.println("Talking, Mimicking sounds.");
        return null;
    }
}
