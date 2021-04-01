package com.company.demo.dependencyinversion.violation;

public class iPhone implements Phone{
    @Override
    public void introduce() {
        System.out.println("Hello, I'm iPhone. I am the most stable phone in the world");
    }

    @Override
    public void printDetail() {
        System.out.println("I'm from US");
    }
}
