package com.company.demo.interfacesegrepation.violation;

public class Penguin implements Bird{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void walk() {
        System.out.println("Yes i can walk");
    }

    @Override
    public void swim() {
        System.out.println("I can swim well.");
    }
}
