package com.epam.mjc.stage0;

class Dog extends Animal{
    Dog(){
        super("brown",4,true);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getDescription();
    }
}
