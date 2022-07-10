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
        System.out.println("This animal is mostly " + color + ".");
        if(numberOfPaws > 0 && numberOfPaws > 1)
            System.out.println("It has " + numberOfPaws + " paws");
        else if(numberOfPaws == 1)
            System.out.println("It has " + numberOfPaws + " paw");
        if(hasFur)
            System.out.println("and a fur.");
        else
            System.out.println("and no fur.");
    }
}
