package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
	    Cheetah cheetah = new Cheetah("cheetah", 2, "fastest animal", 100);
        animals.add(cheetah);

    }
}
