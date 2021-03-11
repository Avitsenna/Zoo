package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;

public class Snail extends Animal implements Move, Eat {

    public Snail(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Snail() {
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat(Animal age) {
        System.out.println("Ем сколько могу, мне надо больше, больше.Я молод и требую больше! ; мне "
                + age.getAge()+" месяцев");
    }

    @Override
    public void run(Animal animal) {
        System.out.println("Пробежка - не преграда для меня!Я вешу - "+ animal.getWeight()+" килограмм");
    }
}
