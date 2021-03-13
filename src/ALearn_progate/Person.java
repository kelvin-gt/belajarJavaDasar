package ALearn_progate;

import java.lang.Math;

class Person {
    public static void printData(String name, int age, double weight, double height) {
        System.out.println("\n---Informasi---");
        System.out.println("Nama Lengkap     : " + name);
        System.out.println("Usia (tahun)     : " + age + " tahun.");
        System.out.println("Berat Badan (kg) : " + weight + " kg.");
        System.out.println("Tinggi Badan (m) : " + height + " m.");

        double bmi = bmi(weight, height);
        System.out.println("Skor BMI         : " + bmi);
        System.out.println("Skor BMI (bulat) : " + Math.round(bmi));

        if (isHealt(bmi)) {
            System.out.println("Anda sehat berdasarkan standar perhitungan BMI");
        }
        else {
            System.out.println("Anda kurang sehat berdasarkan standar perhitungan BMI");
        }
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private static double bmi(double weight, double height) {
        return weight / height / height;
    }

    private static boolean isHealt(double bmi) {
        return bmi >= 18.5 && bmi < 25.0;
    }
}


