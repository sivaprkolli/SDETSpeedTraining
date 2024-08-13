package com.qz.javaBasics;

public class FirstTest {
   static int a;
    short ss;
    long l;
    static double d;
    char c;
    boolean b;
    float f;
    byte bb;
    static String s;
    String s2;

    public static void main(String[] args) {
        FirstTest firstTest = new FirstTest();

        FirstTest firstTest1;
        firstTest1 = new FirstTest();
        System.out.println(s);
        String s1 = s;
        System.out.println(s1);
        System.out.println(firstTest.s2);
        System.out.println(firstTest.c);
        login();
        firstTest1.total();
    }


    public void total(){
        System.out.println("Selenium");
    }

    public static void login(){
        System.out.println("Enter username and password");
    }
}
