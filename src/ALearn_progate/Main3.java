package ALearn_progate;

import java.lang.Math;

class Main3 {
    public static void main(String[] args) {
        printData(fullName("Kelvin","GT"), 20, 50.0, 1.6);
    }

    public static void printData(String name, int age, double weight, double height) {
        System.out.println("Nama ku   : " + name);
        System.out.println("Usia ku   : " + age + " tahun.");
        System.out.println("Berat ku  : " + weight + " kg.");
        System.out.println("Tinggi ku : " + height + " meter.");

        double bmi = bmi(weight, height);
        System.out.println("BMI Asli  : " + bmi);
        System.out.println("BMI Bulat : " + Math.round(bmi));

        if (isHealth(bmi))
        {
            System.out.println("Anda Sehat");
        }
        else
        {
            System.out.println("Anda Tidak Sehat loh...");
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