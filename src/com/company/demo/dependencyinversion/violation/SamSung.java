package com.company.demo.dependencyinversion.violation;

public class SamSung implements Phone{
    @Override
    public void introduce() {
        System.out.println("SumSung is leading in android smart phone. We have some exceptional phones.");
    }

    @Override
    public void printDetail() {
        System.out.println("I'm from Korea.");
    }
}
