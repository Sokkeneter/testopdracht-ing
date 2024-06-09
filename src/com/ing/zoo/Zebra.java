package com.ing.zoo;

import java.util.Random;

public class Zebra implements Herbivore, AnimalWithTrick {
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Zebra(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }
    
    public String getName() {
        return name;
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "does a dance";
        }
        else
        {
            trick = "says a swearword";
        }
        System.out.println(name + " " + trick);
    }
}
