package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;

public class Fox extends Animal implements Move, Eat {

    public Fox(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Fox() {
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat(Animal age) {
        System.out.println("Здоровое питание творит чудеса, я выгляжу на " + age.getWeight()+" лет!");

    }

    @Override
    public void run(Animal animal) {
        System.out.println("Пробежка - не проблема для меня! Я вешу - " + animal.getWeight() + " килограмм");
    }
}
