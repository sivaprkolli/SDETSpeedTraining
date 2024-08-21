package com.qz.javaBasics;

public class Parent {

    private int a;
    public int b;
    protected int c;
    int d;

    public void test1(){
        System.out.println("Test1");
    }

    private void test2(){
        System.out.println("Test2");
    }

    protected void test3(){
        System.out.println("Test3");
    }

    void test4(){
        System.out.println("Test4");
    }

    private static void test5(){
        System.out.println("Test5");
    }

    protected static void test6(){
        System.out.println("Test6");
    }

    static void test7(){
        System.out.println("Test7");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.test2();
        test5();
        System.out.println(parent.a);
    }
}
