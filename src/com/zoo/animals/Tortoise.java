package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;
import com.zoo.exceptions.EatException;

public class Tortoise extends Animal implements Move, Eat {

    public Tortoise(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Tortoise() {
    }

    public Object hide() {
        return "Я в домике, ничего ты мне не сделаешь!";
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

    public Object hibernate() {
        return "Ой, что-то спать захотелось, скоро все равно зима.";
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat(Animal age) {
        System.out.println("Не потолстела ли я? Я выгляжу на - " + age.getWeight() + " лет после еды");
    }

    @Override
    public void run(Animal animal) {
        System.out.println("Хоть я и черепашка, но могу ускориться. Мой вес - " + animal.getWeight() + " килограмм");
    }
}
