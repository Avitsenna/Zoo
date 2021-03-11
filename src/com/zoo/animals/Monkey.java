package com.zoo.animals;

import com.zoo.animals.actions.Eat;
import com.zoo.animals.actions.Move;

public class Monkey extends Animal implements Move, Eat {

    public Monkey(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Monkey() {
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat(Animal age) {
        System.out.println("Я старею определенно из-за нездоровой еды, мне ведь всего лишь " + age.getAge() + " лет");
    }

    @Override
    public void run(Animal animal) {
        System.out.println("Мои ноги не приспособлены для бега! Я вешу - " + animal.getWeight() + " килограмм");
    }
}
