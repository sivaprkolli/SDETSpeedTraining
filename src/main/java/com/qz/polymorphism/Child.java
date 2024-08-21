package com.qz.polymorphism;

public class Child extends Parent {
    @Override
    public void login() {
        System.out.println("Enter login credentials");
        System.out.println("Username :: ");
        System.out.println("Password :: ");
    }

    @Override
    public double sum(int a, double b) {
        double c;
        c = a + b;
        return c;
    }

    @Override
    public float total(float a, float b) {
        float c;
        c = a + b;
        return c;
    }
}
