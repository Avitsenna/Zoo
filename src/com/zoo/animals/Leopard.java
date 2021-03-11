package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;

public class Leopard extends Animal implements Move, Eat {

    public Leopard(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Leopard() {
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat(Animal age) {
        System.out.println("Не могу много есть, не влезает, мне отроду всего "+age.getAge() + " лет");

    }

    @Override
    public void run(Animal animal) {
        System.out.println("Слишком легкая пробежка, даже не пробежка, а прогулка получается. Я вешу - "
                + animal.getWeight()+ " килограмм");
    }
}
