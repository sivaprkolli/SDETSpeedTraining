package com.qz.accessModifiersTest;

import com.qz.javaBasics.Parent;

public class TestAM {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.test1();
        System.out.println(parent.b);
    }

}
