package KelasTerbuka;

import java.util.Arrays;

public class ArrayRef {
    public static void main(String[] args) {

        int[] angka1 = {1,2,3,4,5};
        int[] angka2 = new int[5];

        // Pas by Reference. array2 dari array1. jadi terkonek satu sama lain
        angka2 = angka1;

        System.out.println("Cek memory");
        System.out.println(angka1);
        System.out.println(angka2);
        System.out.println();

        System.out.println("Array1 -> " + Arrays.toString(angka1));
        System.out.println("Array2 -> " + Arrays.toString(angka2));

        angka1[0] = 100;
        System.out.println("Array1 -> " + Arrays.toString(angka1));
        System.out.println("Array2 -> " + Arrays.toString(angka2));

        System.out.println();

        ubahArray(angka1);

        System.out.println("Array1 -> " + Arrays.toString(angka1));
        System.out.println("Array2 -> " + Arrays.toString(angka2));
    }

    private static void ubahArray(int[] dataArray) {
        dataArray[0] = 125;
    }
}
