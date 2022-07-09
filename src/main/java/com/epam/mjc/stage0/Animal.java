package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(){}
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        System.out.println("This animal is mostly " + color + ".");
        if(numberOfPaws > 1)
            return "It has " + numberOfPaws + " paws";
        else if(numberOfPaws == 1)
            return "It has " + numberOfPaws + " paw";
        if(hasFur)
            return "and a fur.";
        else
            return "and no fur.";
    }
}
