package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;
import com.zoo.exceptions.EatException;

public class Horse extends Animal implements Move, Eat {

    public Horse(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Horse() {
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
        System.out.println("Чем здоровее еда, тем моложе ты есть. Мне например " + age.getAge() +
                " ,а выгляжу я на 3 года");
    }

    @Override
    public void run(Animal animal) {
        System.out.println("Не зря мне даны копыта... Мой вес - " + animal.getWeight() + " килограмм");
    }
}
