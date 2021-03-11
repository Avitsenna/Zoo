package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;

public class Tortoise extends Animal implements Move, Eat {

    public Tortoise(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Tortoise() {
    }

    public Object hide() {
        return "Я в домике, ничего ты мне не сделаешь!";
    }

    public Object hibernate() {
        return"Ой, что-то спать захотелось, скоро все равно зима.";
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
