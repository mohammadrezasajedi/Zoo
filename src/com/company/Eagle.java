package com.company;

public class Eagle extends Bird implements Hunter{
    public Eagle(String name, int age, String animalSpecial, int height) {
        super(name, age, animalSpecial, height);
    }
    @Override
    public void hunt(Prey prey) {
        System.out.println("Eagle hunted "+prey.getName());
    }
}
