package com.qz.javaBasics;

public class Child {
    public static void main(String[] args) {
        Child child;
        child = new Child();

        Parent parent = new Parent();
        parent.test1();
        System.out.println(parent.b);
        Parent.test6();
    }
}
