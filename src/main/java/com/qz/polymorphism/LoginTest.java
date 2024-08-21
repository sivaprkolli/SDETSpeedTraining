package com.qz.polymorphism;

public class LoginTest {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Child();
        //parent.login();
        child.login();
    }
}
