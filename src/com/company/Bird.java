package com.company;

public abstract class Bird extends Animal {

    private int height;

    public Bird(String name, int age, String animalSpecial, int height) {
        super(name, age, animalSpecial);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void show() {
        System.out.println("name: " + getName() + ", age: " +getAge()+", , height of fly: "+getHeight()+", \"" + getAnimalSpecial() +" \"");
    }
}
