package KelasTerbuka;

import java.util.Arrays;

public class ArrayDimensi {
    public static void main(String[] args) {

        // belajar array 2D
        int[][] array2D = {
                {1,2},
                {3,4}
        };
        printArray2D(array2D);

        // [baris] [kolom]
        int[][] arrayAngka = new int[5][4];
        for (int i = 0; i < arrayAngka.length; i++)
        {
            System.out.println(Arrays.toString(arrayAngka[i]));
        }


    }


    private static void printArray2D(int[][] dataArray) {
        System.out.println(Arrays.deepToString(dataArray));
    }
}
