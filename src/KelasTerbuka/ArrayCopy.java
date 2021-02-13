package KelasTerbuka;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};
        printArray(arrayAngka1);

        int[] arrayAngka2 = new int[5];

        // Mengcopy array dgn loop
        System.out.println("\nMengcopy array dengan loop...");

        for (int i = 0; i < arrayAngka1.length; i++) {
            // ngisi array1 ke array baru
            arrayAngka2[i] = arrayAngka1[i];
        }

        printArray(arrayAngka1);
        printArray(arrayAngka2);

        // ----------------------------------------------------------------

        // Array Copy
        System.out.println("\nMengcopy array dengan copyOf....\n======================");

        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,5);
        System.out.println("Dari array1 ke array3");
        printArray(arrayAngka3);

        // ----------------------------------------------------------------

        // ini menggcopy bbrp index yg dimau mulai dari mana
        System.out.println("\nMengcopy array dengan copyOfRange....\n======================");

        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5);
        System.out.println("Dari array1 ke array4");
        printArray(arrayAngka4);

        // mengisi array kosong dgn nilai array sama smua. misal {8,8,8,8,8,8}
        System.out.println("\nFill Array....\n======================");

        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);

        Arrays.fill(arrayAngka5,4);
        printArray(arrayAngka5);

        // Boolean cek kecocokan array
        System.out.println("\nMembandingkan array yg satu dgn yg satu \n======================");
        int[] arrayAngka6 = {2,2,3,4,5,6,7};
        int[] arrayAngka7 = {2,1,2,4,5,6,7};

        System.out.println("Cek Arrray6 dan 7 hasilnya: " + Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6, arrayAngka7))
        {
            System.out.println("Array Sama");
        }
        else
        {
            System.out.println("Array Beda");
        }

        // Compare mana array yg lbh besar di array awal atau array terakhir
        System.out.println("\nCompare Array cek mana yg lbh besar\n======================");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        // Mismatch Array cari diposisi mana indexnya berbeda yg satu dgn yg satu
        System.out.println("\nCek Array mana index yang berbeda\n======================");
        System.out.println("Ada perbedaan array pada index " + Arrays.mismatch(arrayAngka6,arrayAngka7));

        // Sort Array
        System.out.println("\nSort Array");
        System.out.println("===============================");

        int[] arrayAngka8 = {1,6,5,2,7,8,2,9,2,5,3};
        printArray(arrayAngka8);

        Arrays.sort(arrayAngka8); // Data array diurutkan
        printArray(arrayAngka8);

        // Search array binary
        System.out.println("\nSearch Array ada di index mana");
        System.out.println("===============================");

        int angka = 3;  // cari posisi index angka 3 dari data arrayAngka8
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " ada diposisi index ke " + posisi);
    }

    // Fungsi cetak isi Array
    private static void printArray(int[] dataArray) {
        System.out.println("Array -> " + Arrays.toString(dataArray));
    }
}
