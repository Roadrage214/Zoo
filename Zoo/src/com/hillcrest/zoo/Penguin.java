package com.hillcrest.zoo;

public class Penguin extends Bird{
    public Penguin(double weight, int age, double length, String color) {
        super(weight, age, length, color,false);
    }

    @Override
    public String eat(String food) {
         food="Fish";
        return null;
    }

    @Override
    public String sleep() {

        System.out.println("8 hours of sleep");
        return null;
    }

    @Override
    public String doSomething() {
        System.out.println("Swim");
        return null;
    }

}
