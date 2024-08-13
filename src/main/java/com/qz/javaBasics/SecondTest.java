package com.qz.javaBasics;

public class SecondTest {

    public static void main(String[] args) {
        SecondTest secondTest = new SecondTest();
        FirstTest firstTest = new FirstTest();

        FirstTest.login();
        int b = FirstTest.a;
        System.out.println(b);

        firstTest.total();
    }


}
