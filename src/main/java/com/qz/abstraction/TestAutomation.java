package com.qz.abstraction;

public class TestAutomation extends AbstractImplementation{
    public static void main(String[] args) {
        TestAutomation testAutomation = new TestAutomation();
        AbstractImplementation abstractImplementation = new TestAutomation();
        AbstractTest abstractTest = new TestAutomation();

        // cannot create instance for Abstract Class/ Interface
//        AbstractTest abstractTest1 = new AbstractTest();
//        InterfaceTest interfaceTest = new InterfaceTest();

        abstractTest.test2();
    }
}
