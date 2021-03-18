package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;
import com.zoo.exceptions.EatException;

public class Leopard extends Animal implements Move, Eat {

    public Leopard(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Leopard() {
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
        System.out.println("Не могу много есть, не влезает, мне отроду всего " + age.getAge() + " лет");

    }

    @Override
    public void run(Animal animal) {
        System.out.println("Слишком легкая пробежка, даже не пробежка, а прогулка получается. Я вешу - "
                + animal.getWeight() + " килограмм");
    }
}
