package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String result = "This animal is mostly " + color + ".";
        if(numberOfPaws > 1)
            result += " It has " + numberOfPaws + " paws ";
        else if(numberOfPaws == 1)
            result += " It has " + numberOfPaws + " paw ";
        if(hasFur)
            result += "and a fur.";
        else
            result += "and no fur.";
        return result;
    }
}
