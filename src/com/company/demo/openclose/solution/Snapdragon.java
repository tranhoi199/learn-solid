package com.company.demo.openclose.solution;

public class Snapdragon implements ChipDevice {
    @Override
    public void hello() {
        System.out.println("I'm re-implement ChipDevice. I'm best chip for android smart phone");
    }
}
