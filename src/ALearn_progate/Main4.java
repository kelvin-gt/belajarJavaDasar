package ALearn_progate;

import java.util.Scanner;

class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa orang mau cek BMI ? : ");
        int org = scanner.nextInt();

        int maxAge = 0;
        int sumAge = 0;

        for (int i = 0; i < org; i++) {

            System.out.println("Orang ke-" + (i+1));

            System.out.print("Masukkan Nama depan mu : ");
            String firstName = scanner.next();

            System.out.print("Masukkan Nama belakang mu : ");
            String lastName = scanner.next();

            System.out.print("Masukkan Umur mu : ");
            int age = scanner.nextInt();

            if (maxAge < age)
            {
                maxAge = age;
            }

            sumAge += age;

            System.out.print("Masukkan Berat Badan mu : ");
            double weight = scanner.nextDouble();

            System.out.print("Masukkan Tinggi Badan mu : ");
            double height = scanner.nextDouble();

            Person.printData(Person.fullName(firstName, lastName), age, weight, height);
            System.out.println();
        }

        System.out.println("Usia tertua : " + maxAge + " tahun.");
        System.out.println("Rata-rata usia : " + (float)sumAge / org + " tahun.");
    }
}