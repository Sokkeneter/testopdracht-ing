package com.ing.zoo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zoo {
    static String[] commands = {"hello", "give leaves", "give meat", "perform trick"};
    static Animal[] animals = {
            new Lion("henk"),
            new Hippo("elsa"),
            new Pig("dora"),
            new Tiger("wally"),
            new Zebra("marty")};

    static <T> List<T> getAnimalsOfType(Class<T> animalType) {
        return Arrays.stream(animals)
                .filter(animalType::isInstance)
                .map(animalType::cast)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("hello")) {
                String[] splitHello = input.split(" ", 2);
                if (splitHello.length > 1) {
                    Optional<Animal> animalFilter = Arrays.stream(animals).filter(animal -> animal.getName().equals(splitHello[1])).findFirst();
                    if (animalFilter.isPresent()) {
                        animalFilter.get().sayHello();
                    } else System.out.println("no one reacted");
                } else for (Animal animal : animals) {
                    animal.sayHello();
                }
            } else if (input.equals("give leaves"))
                for (Herbivore herbivore : getAnimalsOfType(Herbivore.class)) herbivore.eatLeaves();
            else if (input.equals("give meat"))
                for (Carnivore carnivore : getAnimalsOfType(Carnivore.class)) carnivore.eatMeat();
            else if (input.equals("trick")) {
                for (Animal animal: animals){
                }
            }

            switch (input.toLowerCase()) {
                case "give leaves":
                    for (Herbivore herbivore : getAnimalsOfType(Herbivore.class)) herbivore.eatLeaves();
                    break;
                case "give meat":
                    for (Carnivore carnivore : getAnimalsOfType(Carnivore.class)) carnivore.eatMeat();
                    break;
            }

            if (input.equals("bye")) return;

            if (Arrays.stream(commands).noneMatch(input::contains))
                System.out.println("the animals don't understand you");
        }
    }
}
