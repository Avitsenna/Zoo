package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;
import com.zoo.exceptions.EatException;

public class Wolf extends Animal implements Move, Eat {

    public Wolf(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Wolf() {
    }

    public void eat(String place) {
        if (place.equalsIgnoreCase("Шоколад")) {
            try {
                throw new EatException();
            } catch (EatException e) {
                System.out.println("Им нельзя шоколад");
            }
        } else {
            System.out.println(place);
        }
        System.out.println("Ест");
    }

    public void moves(String place) {
        if (place.equalsIgnoreCase("лава")) {
            try {
                throw new EatException();
            } catch (EatException e) {
                System.out.println("Им нельзя, они же сгорят!");
            }
        } else {
            System.out.println(place);
        }
        System.out.println("Движется");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat(Animal age) {
        System.out.println("Не могу есть,зубы не те, старый я уже, мне целых " + age.getAge() + " лет");
    }

    @Override
    public void run(Animal animal) {
        System.out.println("Ты называешь это пробежкой? Я вешу - " + animal.getWeight() + " килограмм");
    }
}
