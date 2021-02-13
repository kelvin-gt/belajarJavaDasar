package ALearn_PZN;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        String[][] name = {
                {"Kel", "Vin"},
                {"Gil","Bert"},
                {"Tan","Oko"}
        };
        System.out.println(Arrays.deepToString(name));
        System.out.println("\nIni Akses Array2D");
        System.out.println("Akses Vin -> " + name[0][1]);
        System.out.println("Akses Gil -> " + name[1][0]);
        System.out.println("Akses Oko -> " + name[2][1]);

        // Buat Learn_PZN.Array Kosong
        // [baris][kolom]
        System.out.println();
        int[][] number = new int[5][4];
        for (int i= 0; i < number.length; i++)
        {
            System.out.println(Arrays.toString(number[i]));
        }

        // Penjumlahan Learn_PZN.Array
        int[] number1 = {1,2,3,4,5};
        int[] number2 = {6,7,8,9,10};
        int[] hasilTambah = new int[number1.length];

        for (int i = 0; i < number1.length; i++)
        {
            hasilTambah[i] = number1[i] + number2[i];
        }
        System.out.println("Learn_PZN.Array number1 -> " + Arrays.toString(number1));
        System.out.println("Learn_PZN.Array number2 -> " + Arrays.toString(number2));
        System.out.println("Learn_PZN.Array tambah  -> " + Arrays.toString(hasilTambah));

        // Menggabungkan 2 data Learn_PZN.Array ke 1 Learn_PZN.Array
        System.out.println();

        int[] arrayGabung = new int[number1.length + number2.length];

        for (int j = 0; j < number1.length; j++)
        {
            arrayGabung[j] = number1[j];
        }

        for (int k = 0; k < number2.length; k++)
        {
            arrayGabung[k + number2.length] = number2[k];
        }

        System.out.println("Learn_PZN.Array number1 -> " + Arrays.toString(number1));
        System.out.println("Learn_PZN.Array number2 -> " + Arrays.toString(number2));
        System.out.println("Learn_PZN.Array Gabung  -> " + Arrays.toString(arrayGabung));

        // Sort Learn_PZN.Array
        System.out.println();

        int[] randomNumber = {9,1,5,2,4,8,6,3,7};
        System.out.println("Random Number Learn_PZN.Array -> " + Arrays.toString(randomNumber));
        Arrays.sort(randomNumber);
        System.out.println("Sort Number         -> " + Arrays.toString(randomNumber));

        // Learn_PZN.Array Reverse
        int[] arrayReverse = Arrays.copyOf(randomNumber, randomNumber.length);
        for (int v = 0; v < randomNumber.length; v++)
        {
            randomNumber[v] = arrayReverse[(arrayReverse.length - 1) - v];
        }
        System.out.println("Learn_PZN.Array Reverse       -> " + Arrays.toString(randomNumber));

        // Java 14 Switch Lambda tanpa break;

        var nilai = "B";
        System.out.println();
        System.out.println("Switch Lambda\n=============================");

        switch (nilai)
        {
            case "A" -> System.out.println("Nilai anda sangat baik");
            case "B","C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Nilai anda agak kurang");
            case "E" -> System.out.println("Anda tidak lulus");
            default -> System.out.println("Error........");
        }

        // Switch dengan yield (return value)

        System.out.println();
        System.out.println("Switch Yield\n=============================");

        var nilai2 = "C";

        String ucapan = switch(nilai) {
            case "A":
                yield "Nilai anda sangat baik";
            case "B","C":
                yield "Nilai anda cukup baik";
            case "D":
                yield "Nilai anda kurang";
            default:
                yield "Anda salah jurusan....";
        };
        System.out.println(ucapan);



    }

}
