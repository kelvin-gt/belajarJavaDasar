package ALearn_PZN;

public class MethodVariableArgument {
    public static void main(String[] args) {

        // array dan cetak utk method pertama
//        int[] nilai = {80,80,90,100};
//        sayCongrats("Kelvin",nilai);

        // array dan cetak utk method kedua dgn argument("...") pada array nya
        sayCongrats("Kelvin", 80,80,90,65);


    }

    // Tanpa Argument di parameter Learn_PZN.Array Int
//    static void sayCongrats(String name, int[] values) {
//        int total = 0;
//        for (int value : values)
//        {
//            total += value;
//        }
//        int finalValue = total / values.length;
//
//        if (finalValue >= 75)
//        {
//            System.out.println("Nilai Akhir mu " + finalValue);
//            System.out.println("Selamat " + name + " anda lulus.");
//        }
//        else
//        {
//            System.out.println("Nilai Akhir mu " + finalValue);
//            System.out.println("MAaf " + name + " anda belum lulus.");
//        }
//    }

    static void sayCongrats(String name, int... values) {
        int total = 0;
        for (int value : values)
        {
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75)
        {
            System.out.println("Nilai Akhir mu " + finalValue);
            System.out.println("Selamat " + name + " anda lulus.");
        }
        else
        {
            System.out.println("Nilai Akhir mu " + finalValue);
            System.out.println("MAaf " + name + " anda belum lulus.");
        }
    }


}
