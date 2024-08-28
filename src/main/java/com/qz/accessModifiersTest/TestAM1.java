package com.qz.accessModifiersTest;

import com.qz.javaBasics.Parent;

public class TestAM1 extends Parent {

    public static void main(String[] args) {
        Parent parent = new Parent();
        TestAM1 testAM1 = new TestAM1();
        testAM1.test3();
        System.out.println(testAM1.c);
    }
}
