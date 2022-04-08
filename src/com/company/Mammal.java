package com.company;

public abstract class Mammal extends Animal {

    private int runSpeed;

    public Mammal(String name, int age, String animalSpecial, int runSpeed) {
        super(name, age, animalSpecial);
        this.runSpeed = runSpeed;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    @Override
    public void show() {
        System.out.println("name: " + getName() + ", age: " +getAge()+", speed: "+getRunSpeed()+", \"" + getAnimalSpecial() +" \"");
    }

}
