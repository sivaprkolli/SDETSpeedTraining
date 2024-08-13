package com.qz.inheritance;

public class Child extends Parent {

    public static void main(String[] args) {
        Child child = new Child();

/* Parent parent = new Child();
        parent.login();
        System.out.println(parent.s);*/

//        new Child().login();
//        new Child().test1();

        child.test1();
        child.login();
        System.out.println(child.s);
        test2();

    }

    public void test1() {
        System.out.println("Test");
    }
}
