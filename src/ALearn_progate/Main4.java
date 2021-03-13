package ALearn_progate;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nProgram Sederhana Cek Kesehatan dengan BMI");

        System.out.print("Ada berapa banyak orang: ");
        int nOrg = scanner.nextInt();

        int sumAge = 0;
        int minAge = Integer.MAX_VALUE;
        int maxAge = 0;

        for (int i = 0; i < nOrg; i++) {

            System.out.println("\nInput data orang ke-" + (i+1));

            System.out.print("Input Nama Depan       : ");
            String firstName = scanner.next();

            System.out.print("Input Nama Belakang    : ");
            String lastName = scanner.next();

            System.out.print("Input Umur             : ");
            int age = scanner.nextInt();

            // menjumlah usia
            sumAge += age;

            // mencari usia termuda
            if (minAge > age) {
                minAge = age;
            }

            // mencari usia tertua
            if (maxAge < age) {
                maxAge = age;
            }

            System.out.print("Input Berat Badan (kg) : ");
            double weight = scanner.nextDouble();

            System.out.print("Input Tinggi Badan (m) : ");
            double height = scanner.nextDouble();

            // fungsi printData
            Person.printData(Person.fullName(firstName,lastName), age, weight, height);
        }

        System.out.println();
        System.out.println("Kesimpulan");
        System.out.println("Usia termuda   : " + minAge + " tahun.");
        System.out.println("Usia tertua    : " + maxAge + " tahun.");
        System.out.println("Rata-rata usia : " + sumAge / nOrg + " tahun.");
    }
}