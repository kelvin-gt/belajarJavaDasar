package ALearn_PZN;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // [baris][kolom]
        String[][] name = {
                {"Kelvin","Gilbert","T..."},
                {"Timo","Werner","CFC"},
                {"N'golo","Kante","CFC"}
        };

        // utk array 2D pake deepToString
        System.out.println();

        System.out.println(Arrays.deepToString(name));
        System.out.println("Akses Gilbert => " + name[0][1]);
        System.out.println("Akses CFC     => " + name[1][2]);
        System.out.println("Akses N'golo  => " + name[2][0]);

        // buat array kosong 2D
        System.out.println();
        int[][] angka = new int[5][4];

        for (int i = 0; i < angka.length; i++) {
            System.out.println(Arrays.toString(angka[i]));
        }

        // menjumlah array
        System.out.println();

        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = {6,7,8,9,10};
        int[] jumlahArray = new int[arrayAngka1.length];

        for (int i = 0; i < arrayAngka1.length; i++) {
            jumlahArray[i] = arrayAngka1[i] + arrayAngka2[i];
        }
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        printArray(jumlahArray);

        // menggabungka array
        System.out.println();

        int[] gabungArray = new int[arrayAngka1.length + arrayAngka2.length];

        for (int i = 0; i < arrayAngka1.length; i++) {
            gabungArray[i] = arrayAngka1[i];
        }

        for (int i = 0; i < arrayAngka1.length; i++) {
            gabungArray[i + arrayAngka1.length] = arrayAngka2[i];
        }

        printArray(arrayAngka1);
        printArray(arrayAngka2);
        printArray(gabungArray);

        // sort array
        System.out.println();

        int[] numberz = {9,1,5,2,4,8,6,3,7};
        printArray(numberz);

        Arrays.sort(numberz);
        printArray(numberz);

        // reverse array
        System.out.println();
        printArray(numberz);

        int[] reverseArray = Arrays.copyOf(numberz,numberz.length);

        for (int i = 0; i < numberz.length; i++) {
            numberz[i] = reverseArray[(reverseArray.length - 1) - i];
        }
        printArray(numberz);
    }

    private static void printArray(int[] dataArray) {
        System.out.println(Arrays.toString(dataArray));
    }
}
