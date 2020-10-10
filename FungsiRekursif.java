package com.pboreg;

import java.util.*;

public class FungsiRekursif {

    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai: ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai = " + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);

        int faktorial = hitungfaktorial(nilai);
        System.out.println("hasil faktorial = " + faktorial);
    }
    // fungsi rekrusif sederhana
    private static int hitungfaktorial(int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 1){
            return parameter;
        }

        return parameter * hitungfaktorial(parameter - 1);

    }

    private static int jumlahNilai(int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 0){
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);

    }

    public static void printNilai (int parameter){
        System.out.println("Nilai = " + parameter);

        if (parameter == 0){
            return;
        }

        parameter--;

        printNilai(parameter);
    }
}
