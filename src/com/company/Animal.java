package com.company;

public  abstract class Animal {
    private String name;
    private int age;
    private String animalSpecial;
    public abstract void show();

    public Animal(String name, int age, String animalSpecial) {
        this.name = name;
        this.age = age;
        this.animalSpecial = animalSpecial;
    }

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

    public String getAnimalSpecial() {
        return animalSpecial;
    }

    public void setAnimalSpecial(String animalSpecial) {
        this.animalSpecial = animalSpecial;
    }

}
