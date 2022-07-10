package com.epam.mjc.stage0;

public class Bird extends Animal{
    public Bird(){
        super("blue",2,false);
    }


    public String getDescription(){
        super.getDescription();
        return "Moreover, it has 2 wings and can fly.";
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.getDescription();
    }
}
