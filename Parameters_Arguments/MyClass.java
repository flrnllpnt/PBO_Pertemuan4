package com.pboreg.Parameters_Arguments;

public class MyClass {
    static void myMethod(String fname){
        System.out.println(fname + " Refsnes");
    }
    public static void main(String[] args){
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}
