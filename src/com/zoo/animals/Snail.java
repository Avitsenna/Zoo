package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;
import com.zoo.exceptions.EatException;

public class Snail extends Animal implements Move, Eat {

    public Snail(String name, int age, int weight) {
        super(name, age, weight);
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

    public Snail() {
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat(Animal age) {
        System.out.println("Ем сколько могу, мне надо больше, больше.Я молод и требую больше! ; мне "
                + age.getAge() + " месяцев");
    }

    @Override
    public void run(Animal animal) {
        System.out.println("Пробежка - не преграда для меня!Я вешу - " + animal.getWeight() + " килограмм");
    }
}
