package com.gabiksoft.tests;

import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args) {
        Human bohdan = new Human();
        bohdan.setAge(25);
        bohdan.setName("Bohdan");
        bohdan.setSex("male");
        bohdan.setSurname("Gaba");

        Human andriy = new Human();
        andriy.setAge(30);
        andriy.setName("Andriy");
        andriy.setSex("male");
        andriy.setSurname("Gaba");

        Animal dog = new Animal();
        dog.setAge(3);
        dog.setName("Rex");
        dog.setSex("Male");
        dog.setType(Animal.AnimalType.MAMMAL);

        Animal cat = new Animal();
        cat.setAge(3);
        cat.setName("Mira");
        cat.setSex("Female");
        cat.setType(Animal.AnimalType.FISH);

        List<Human> humans = new ArrayList<Human>();
        humans.add(bohdan);
        humans.add(andriy);

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(dog);
        animals.add(cat);

        printList(humans);
        printList(animals);
    }

    public static<T extends Parent> void printList(List<? extends Parent> list) {
        for (int i = 0; i < list.size(); i++) {
            T item = (T) list.get(i);
                System.out.println(item.getName());
            }
        }
    }
