package com.company.demo.interfacesegrepation.solution;

public class Penguin implements Swim, Walkable{
    @Override
    public void walk() {
        System.out.println("I implement 2 interface. I can work");
    }

    @Override
    public void swim() {
        System.out.println("I implement 2 interface. Swim is my strength");
    }
}
