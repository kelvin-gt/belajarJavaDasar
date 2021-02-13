package ALearn_progate;

import java.lang.Math;

class Person {
    public static void printData(String name, int age, double weight, double height) {
        System.out.println("Nama mu   : " + name);
        System.out.println("Usia mu   : " + age + " tahun.");
        System.out.println("Berat mu  : " + weight + " kg.");
        System.out.println("Tinggi mu : " + height + " m.");

        double bmi = bmi(weight, height);
        System.out.println("BMI Asli  : " + bmi);
        System.out.println("BMI Bulat : " + Math.round(bmi));

        if (isHealth(bmi))
        {
            System.out.println("Anda Sehat loh...");
        }
        else
        {
            System.out.println("Rasanya Anda Kurang Sehat loh....");
        }
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static double bmi(double weight, double height) {
        return weight / height / height;
    }

    public static boolean isHealth(double bmi) {
        return bmi >= 18.5 && bmi < 25.0;
    }
}