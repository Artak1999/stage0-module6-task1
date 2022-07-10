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

    public void getDescription(){
        System.out.print("This animal is mostly " + color + ".");
        if(numberOfPaws == 1)
            System.out.print(" It has " + numberOfPaws + " paw ");
        else
            System.out.print(" It has " + numberOfPaws + " paws ");
        if(hasFur)
            System.out.print("and a fur.");
        else
            System.out.print("and no fur.");
    }
}
