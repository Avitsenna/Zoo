package com.zoo;

import com.zoo.animals.Tortoise;

public class Main {

    public static void main(String[] args) {
        Tortoise turtle = new Tortoise();
        turtle.setName("You");
        System.out.println(turtle.hibernate());
    }
}
