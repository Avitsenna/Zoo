package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;

public class Horse extends Animal implements Move, Eat {

    public Horse(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Horse() {
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
        System.out.println("Не зря мне даны копыта... Мой вес - "+animal.getWeight()+" килограмм");
    }
}
