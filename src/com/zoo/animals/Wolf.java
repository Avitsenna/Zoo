package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;

public class Wolf extends Animal implements Move, Eat {

    public Wolf(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Wolf() {
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
        System.out.println("Ты называешь это пробежкой? Я вешу - "+ animal.getWeight()+" килограмм");
    }
}
