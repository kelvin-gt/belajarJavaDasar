package ALearn_PZN;

public class MethodVariableArgument {
    public static void main(String[] args) {

        // array dan cetak utk method pertama
        int[] nilai = {65,70,75,80,85,90};

        // array dan cetak utk method kedua dgn argument("...") pada array nya
        // fungsi
        sayCongrats("Kelvin",nilai);
        System.out.println();
        sayCongrats2("Kelvin",60,65,70,75,80,85);
    }

    private static void sayCongrats(String name, int[] values) {
        int nilai = 0;

        for (int value: values) {
            nilai += value;
        }

        int finalValue = nilai / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " anda lulus.");
            System.out.println("Nilai akhir kamu : " + finalValue);
        }
        else {
            System.out.println("Maaf " + name + " anda belum lulus.");
            System.out.println("Nilai akhir kamu : " + finalValue);
        }
    }

    private static void sayCongrats2(String name, int... values) {
        int nilai = 0;

        for (int value: values) {
            nilai += value;
        }

        int finalValue = nilai / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " anda lulus.");
            System.out.println("Nilai akhirmu : " + finalValue);
        }
        else {
            System.out.println("Maaf " + name + " anda lulus.");
            System.out.println("Nilai akhirmu : " + finalValue);
        }
    }
}
