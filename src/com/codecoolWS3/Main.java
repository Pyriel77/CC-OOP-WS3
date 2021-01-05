package com.codecoolWS3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animal = new ArrayList<>();
        Cat cica = new Cat("Béla", true);
        Dog kutya = new Dog("Lucy", false);
        animal.add(cica);
        animal.add(kutya);
        Owner owner = new Owner(animal);
        owner.feed();

    }

}
