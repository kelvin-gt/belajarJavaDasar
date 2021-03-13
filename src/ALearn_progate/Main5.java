package ALearn_progate;

import java.util.Arrays;
import java.util.Scanner;

class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMembuat Program Sederhana \nMengecek nilai inputan terkecil dan tertinggi");
        System.out.println("--------------------------------------------");

        System.out.print("\nInput berapa banyak orang : ");
        int nOrg = scanner.nextInt();

        int[] umur = new int[nOrg];

        System.out.println();
        for (int i = 0; i < nOrg; i++) {
            System.out.print("Input umur ke-" + (i+1) + " : ");
            umur[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Isi array => "+ Arrays.toString(umur));

        int min = umur[0];
        int max = umur[0];
        int tempSum = 0;

        for (int i = 0; i < nOrg; i++) {
            if (min > umur[i]) {
                min = umur[i];
            }

            if (max < umur[i]) {
                max = umur[i];
            }

            tempSum += umur[i];
        }

        System.out.println("\nUmur terkecil adalah : " + min);
        System.out.println("Umur terbesar adalah : " + max);
        System.out.println("Jumlah umur : " + tempSum);
    }
}