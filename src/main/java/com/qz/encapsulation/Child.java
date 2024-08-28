package com.qz.encapsulation;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        int a = child.getId();
        System.out.println(a);

        String b = child.getName();
        System.out.println(b);

        child.setId(101);
        System.out.println(child.getId());

        child.setName("Playwright");
        System.out.println(child.getName());
    }
}
