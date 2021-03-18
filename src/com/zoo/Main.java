package com.zoo;

import com.zoo.animals.Tortoise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        String food;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            food = bufferedReader.readLine();
        } catch (IOException | IllegalArgumentException e) {
        }
        String place;
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            place = bufferedReader.readLine();
            //  System.exit(0);
            //   throw new IllegalArgumentException();
        } catch (IOException | IllegalArgumentException e ) {
        }
        Tortoise turtle = new Tortoise();
        turtle.setName("You");
        System.out.println(turtle.hibernate());
    }
}
