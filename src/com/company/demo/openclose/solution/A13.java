package com.company.demo.openclose.solution;

public class A13 implements ChipDevice{
    @Override
    public void hello() {
        System.out.println("I'm reimplement ChipDevice. I'm from Apple");
    }
}
