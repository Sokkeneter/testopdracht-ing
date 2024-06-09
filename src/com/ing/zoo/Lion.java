package com.ing.zoo;

public class Lion implements Carnivore {
    private final String name;
    private String helloText;
    private String eatText;

    
    public Lion(String name)
    {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
