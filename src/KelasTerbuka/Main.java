package KelasTerbuka;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Java");
        System.out.println(5+3);
        System.out.println("5" + "3");
        System.out.println("5+3");
        System.out.println((double)5 / 2);

        int nilai = 70;
        char huruf;
        if (nilai >= 90)
        {
            huruf = 'A';
        }
        else if (nilai >= 80)
        {
            huruf = 'B';
        }
        else if (nilai >= 70)
        {
            huruf = 'C';
        }
        else
        {
            huruf = 'D';
        }
        System.out.println("Nilai mu " + nilai + " dengan huruf " + huruf);

        int[] numbers = {5,3,7,1,7,9,2,4,1,1};
        int tempGanjil = 0;
        int tempGenap = 0;
        int minAge = numbers[0];
        int maxAge = numbers[0];
        int totalNum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 == 1)
            {
                tempGanjil += numbers[i];
            }
            else
            {
                tempGenap += numbers[i];
            }
        }
        System.out.println("Jumlah nilai ganjil = " + tempGanjil);
        System.out.println("Jumlah nilai genap = " + tempGenap);

        for (int number: numbers)
        {
            if (number % 2 == 1)
            {
                tempGanjil += number;
            }
            else
            {
                tempGenap += number;
            }
        }
        System.out.println("Jumlah nilai ganjil = " + tempGanjil);
        System.out.println("Jumlah nilai genap = " + tempGenap);

        // Membandingkan nilai

        for (int number: numbers)
        {
            if (maxAge < number)
            {
                maxAge = number;
            }
        }
        System.out.println("Nilai terbesar dari array numbers adlh : " + maxAge);

        for (int number: numbers)
        {
            if (minAge > number)
            {
                minAge = number;
            }
        }
        System.out.println("Nilai terkecil dari array numbers adlh : " + minAge);

        for (int number: numbers)
        {
            totalNum += number;
        }
        System.out.println("SUM anggka yg ada di array jadinya : " + totalNum);
        System.out.println("Rata rata dari SUM nya adalah : " +totalNum / numbers.length);

        printArray(numbers);

        int angkaa = 20;
        switch (angkaa % 2)
        {
            case 0:
                System.out.println("Angaka ini genap");
                break;
            case 1:
                System.out.println("Angka ini ganjil");
                break;
            default:
                System.out.println("opss...");
                break;
        }

        boolean bool = 4 + 2 == 7;
        System.out.println(bool);

        for (int z = 10; z <= 15; z++)
        {
            if (z == 14)
            {
                continue;
            }
            System.out.println("Angka : " + z);
        }

        for (int zz = 10; zz <= 15; zz++)
        {
            System.out.println("Angka : " + zz);
            if (zz == 14)
            {
                System.out.println("Stop sampai disini angkanya...");
                break;
            }
        }

        printArray(numbers);
        int[] number2 = Arrays.copyOf(numbers, numbers.length + 1);
        number2[numbers.length - 1] = 100;
        printArray(number2);

        for (int n = 111; n <= 115; n++)
        {
            numbers = Arrays.copyOf(numbers, numbers.length + 1);
            numbers[numbers.length - 1] = n;
        }
        printArray(numbers);

//        int c = 6;
//        for (int a = 0; a < c; a++)
//        {
//            for (int b = 0; b < a; b++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int c = 4;
        System.out.println();
        for (int a = 0; a <= c; a++)
        {
            for (int b = 4; b >= a; b--)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int e = 0; e < number2.length; e++)
        {
            System.out.println("Index ke- " + e + " = " + number2[e]);
        }

        // mengcopy array dengan loop
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5];
        for (int u = 0; u < array1.length; u++)
        {
            array2[u] = array1[u];
        }
        printArray(array1);
        printArray(array2);

        // mengcopy array dengan copyOf

        int[] array3 = Arrays.copyOf(array1,5);
        printArray(array3);

        // fungsi copyOfRange

        int[] array4 = Arrays.copyOfRange(array3,2,5);
        printArray(array4);

        // fiil array

        int[] array5 = new int[10];
        Arrays.fill(array5,5);
        printArray(array5);

        // boolean array cek

        if (Arrays.equals(array3,array2))
        {
            System.out.println("Sama");
        }
        else
        {
            System.out.println("Beda");
        }

        // Array compare
        System.out.println(Arrays.compare(array4,array5));

        // Array mismatch
        System.out.println(Arrays.mismatch(array1,array2));

        // Sort Array
        int[] array10 = {1,6,3,8,0,3,7,3,7,4,7,5,3};
        Arrays.sort(array10);
        printArray(array10);

        // Search binary array
        System.out.println(Arrays.binarySearch(array10,3));


    }


    private static void printArray(int[] dataArray) {
        System.out.println("Array : " + Arrays.toString(dataArray));
    }
}
