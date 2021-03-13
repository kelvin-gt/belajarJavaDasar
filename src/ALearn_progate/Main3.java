package ALearn_progate;
import java.lang.Math;
public class Main3 {
    public static void main(String[] args) {

        printData(fullName("Kelvin","Gilbert","T..."), 20, 1.6,50.0);
    }

    private static void printData(String name, int age, double height, double weight) {
        System.out.println("Nama        : " + name);
        System.out.println("Umur        : " + age);
        System.out.println("Tinggi      : " + height);
        System.out.println("Berat       : " + weight);


        double bmi = bmi(height, weight);
        System.out.println("BMI         : " + bmi);
        System.out.println("BMI (bulat) : " + Math.round(bmi));

        if (isHelth(bmi)) {
            System.out.println("Status      : Anda Sehat dengan dalam rentang standarBMI");
        }
        else {
            System.out.println("Status      : Anda Kurang Sehat dengan dalam rentang standar BMI");
        }
    }

    private static String fullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }

    private static double bmi(double height, double weight) {
        return weight / height / height;
    }

    private static boolean isHelth(double bmi) {
        return bmi >= 18.5 && bmi < 25.0;
    }
}