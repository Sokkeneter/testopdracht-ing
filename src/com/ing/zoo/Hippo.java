package com.ing.zoo;

public class Hippo implements Herbivore {
    private String name;
    private String helloText;
    private String eatText;

    public Hippo(String name)
    {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean canDoTrick() {
        return false;
    }

    public void sayHello()
    {
        helloText = "splash (in water)";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
