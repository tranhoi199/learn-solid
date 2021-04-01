package com.company.demo.liskovsubstitution.violation;

public class Hawk extends Animal {
    @Override
    public void jump() {
        System.out.println("I can't jump");
    }

    @Override
    public void run() {
        System.out.println("I can't run");
    }
}
