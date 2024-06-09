package com.ing.zoo;

import java.util.Random;

public class Pig implements Carnivore, AnimalWithTrick  {
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Pig(String name)
    {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public void sayHello()
    {
        helloText = "splash (in mud)";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(name + " " + trick);
    }
}
