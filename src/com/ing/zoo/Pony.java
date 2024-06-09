package com.ing.zoo;

import java.util.Random;

public class Pony implements Carnivore, AnimalWithTrick {
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Pony(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        helloText = "nice day innit" ;
        System.out.println(helloText);
    }
    
    public String getName() {
        return name;
    }

    public void eatMeat()
    {
        eatText = "i'm not eating this but thanks anyway";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "says no i don't think i will";
        }
        else
        {
            trick = "yeets you into the sun";
        }
        System.out.println(name + " " + trick);
    }
}
