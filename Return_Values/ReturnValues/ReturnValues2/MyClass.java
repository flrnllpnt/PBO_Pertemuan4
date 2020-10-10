package com.pboreg.Return_Values.ReturnValues.ReturnValues2;

public class MyClass {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(5,3);
        System.out.println(z);
    }
}
