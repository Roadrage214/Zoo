package com.hillcrest.zoo;

import java.util.Scanner;

public class ZooTester {

    public static void main(String[] args) {
        System.out.println("This is a zoo..... literally");
        System.out.println("Which animal would you like to create?");
        //TODO Replace this
        System.out.println("1 - the first animal");
        //TODO Add 2 Birds
        //TODO Add 2 Reptiles
        //TODO Add 2 Mammals
        //TODO Add 2 Fish

        Scanner in = new Scanner(System.in);
        int type = in.nextInt();

        Animal animal = null;

        switch (type) {
            case 1:
                //BIRD 1
                break;
            case 2:
                //BIRD 2
                break;
            case 3:
                // REPTILE 1
                break;
            case 4:
                //REPTILE 2
                break;
            case 5:
                //MAMMAL 1
                break;
            case 6:
                //MAMMAL 2
                break;
            case 7:
                //FISH 1
                break;
            case 8:
                //FIST 2
                break;
            default:
                throw new IllegalArgumentException("Invalid type");
        }

        System.out.println(animal.move());
        System.out.println(animal.eat("Yummy food"));
        System.out.println(animal.doSomething());
        System.out.println(animal.sleep());
        System.out.println();
    }
}
