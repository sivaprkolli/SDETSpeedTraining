package com.qz.polymorphism;

public class MethodOverLoadingTest {

    public static void main(String[] args) {
     sum();
     sum(23243, 435435);
     sum(12.6, 10.1);
     isDisplayed(true);

     register("siva@yopmail.com", "Siva", 13243249);
     register("UK", "PR13QY", "JNTU");
    }

    public static void register(String email, String lastName, int phone){

    }

    public static void register(String email, String lastName, String firstName, int phone){

    }

    public static void register(String address, String pin, String landmark){

    }

    public void total(int a, int b){

    }

    public void total(int a, double b){

    }

    public void total(int a, int b, int c){

    }

    public static void sum(){
        int a=15, b=15, c;
        c = a+b;
        System.out.println("c value : " + c);
    }

    public static boolean isDisplayed(){
        return false;
    }

    public static boolean isDisplayed(boolean flag){
        return flag;
    }

    public static void sum(int a, int b){
        System.out.println("a+ b :: " + (a+b));
    }

    /*public static int sum(int a, int b){
        System.out.println("a+ b :: " + (a+b));
        return a+b;
    }*/

    public static void sum(int a, int b, int c){
        int d;
        d = a+b+c;
        System.out.println("d value :: " +d);
    }

    public static void sum(int a, double b){
        double c;
        c = a+b;
        System.out.println("c value : " + c);
    }

    public static void sum(double a, int b){
        double c;
        c = a+b;
        System.out.println("c value : " + c);
    }

    public static void sum(double a, double b){
        double c;
        c = a+b;
        System.out.println("c value : " + c);
    }


}

