package com.pboreg.Return_Values.ReturnValues;

public class MyClass {
    static int myMethod(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(5,3));
    }
}
