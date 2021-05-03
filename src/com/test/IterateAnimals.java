package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Animal {
    public void feed() {
        System.out.println("Animal feed()");
    }
}

class Pet extends Animal {
    public void call() {
        System.out.println("Pet call()");
    }
}

class Cat extends Pet {
    public void meow(){
        System.out.println("Cat meow");
    }
}

class Dog extends Pet {
    public void how(){
        System.out.println("Dog how");
    }
}

public class IterateAnimals{
    //итератор для прохождения всех объектов animal и его наследников
    public static void iterateAnimals(Collection<? extends Animal> animals){
        for (Animal a : animals) {
            System.out.println(a);
        }
    }


    //итератор для прохождения всех объектов cat и прадедов
    public static void iterateAnimalsWithoutDog(Collection<? super Cat> catsAndUp){
        for (Object c : catsAndUp) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());
        pets.add(new Pet());

 iterateAnimalsWithoutDog(cats);
// iterateAnimalsWithoutDog(dogs); так не работает
 iterateAnimalsWithoutDog(pets);

 iterateAnimals(cats);
 iterateAnimals(dogs);
 iterateAnimals(pets);

    }
}