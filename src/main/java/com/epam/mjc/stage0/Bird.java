package com.epam.mjc.stage0;

class Bird extends Animal{
    public Bird(){
        super("blue",2,false);
    }

    @Override
    String getDescription(){
        super.getDescription();
        return "This animal is mostly blue.";
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.getDescription();
    }
}
