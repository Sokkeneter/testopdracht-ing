package com.ing.zoo;

import java.util.Random;

public class Tiger implements Carnivore, AnimalWithTrick  {
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Tiger(String name)
    {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean canDoTrick() {
        return true;
    }
    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
