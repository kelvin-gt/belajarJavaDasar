package KelasTerbuka;

import ALearn_PZN.Array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5,6,7,8,9,0};
        printArray(arrayAngka1);

        // buat array kosongan
        int[] arrayAngka2 = new int[arrayAngka1.length];
        printArray(arrayAngka2);

        // copy arrayAngka1 ke arrayAngka2 dgn loop for
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka2);

        // mengcopy array dgn library copyOf
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka2,arrayAngka2.length);
        printArray(arrayAngka3);

        // menambah isi array dgn library copyOf
        arrayAngka3 = Arrays.copyOf(arrayAngka3,arrayAngka3.length + 1);
        arrayAngka3[arrayAngka3.length - 1] = 11;

        printArray(arrayAngka3);

        // mengcopy array dgn mengambil sbagian index yg diinginkan dgn library copyOfRange
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka3,5,11);
        printArray(arrayAngka4);

        // mengisi array serentak dgn nilai 8 smua
        int[] arrayAngka5 = new int[10];
        Arrays.fill(arrayAngka5,8);
        printArray(arrayAngka5);

        // mengecek kesamaan array
        int[] arrayAngka6 = {2,1,3,4,5,6,7};
        int[] arrayAngka7 = {2,1,2,4,5,6,7};

        System.out.println();
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));
        if (Arrays.equals(arrayAngka6,arrayAngka7)) {
            System.out.println("Array nya sama");
        }
        else {
            System.out.println("Array ny beda");
        }

        // melihat perbedaan array di index ny, dibanding mulai dari awalan
        System.out.println();
        System.out.println("Arrray angka 6 dan 7 \nterdapat perbedaan di index " + Arrays.mismatch(arrayAngka6,arrayAngka7));

        // membandingkan mana jumlah isi array yg besar
        System.out.println();
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
        if (Arrays.compare(arrayAngka6,arrayAngka7) == 1) {
            System.out.println("Array 6 lbih besar.");
        }
        else {
            System.out.println("Array 7 lbih besar.");
        }

        // mencari posisi sbuah angka di index array dgn library binarySearch
        // namun sblm itu hrs diurutkan dahulu dgn lib sort
        System.out.println();

        int[] arrayAngka8 = {4,5,6,0,1,2,3,7,8,9,11};
        printArray(arrayAngka8);

        // sorting
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // cari angka 3
        int angkaa = 3;
        System.out.println("Posisi angka " + angkaa + " ada di index ke " + Arrays.binarySearch(arrayAngka8,angkaa));
    }

    private static void printArray(int[] dataArray) {
        System.out.println("\nArray => " + Arrays.toString(dataArray));
    }
}
