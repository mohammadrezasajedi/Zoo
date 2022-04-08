package com.company;

public class Cheetah extends Mammal implements Hunter{
    public Cheetah(String name, int age, String animalSpecial, int runSpeed) {
        super(name, age, animalSpecial, runSpeed);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println("Cheetah hunted "+prey.getName());
    }
}
