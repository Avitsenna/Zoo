package com.zoo.animals;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private int weight;


    public Animal(String name, int age,int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }


    public Animal() {//просто перегрузка
    }

    public abstract void sleep();//один абстрактный метод по условию


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                weight == animal.weight &&
                Objects.equals(name, animal.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }
}
