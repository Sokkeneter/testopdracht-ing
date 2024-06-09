package com.ing.zoo;

import java.util.Random;

public class Bunny implements Herbivore, AnimalWithTrick {
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Bunny(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        helloText = "wee woe";
        System.out.println(helloText);
    }
    
    public String getName() {
        return name;
    }

    public void eatLeaves()
    {
        eatText = "crunch munch more pls";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "binkies away";
        }
        else
        {
            trick = "poops";
        }
        System.out.println(name + " " + trick);
    }
}
