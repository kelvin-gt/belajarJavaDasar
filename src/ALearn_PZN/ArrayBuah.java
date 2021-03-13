package ALearn_PZN;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBuah {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Input data berapa buah? : ");
//        int nBuah = scanner.nextInt();
//
//        String[] namaBuah = new String[nBuah];
//        System.out.println();
//
//        // Membuat inputan ke data arrray
//        for (int i = 0; i < namaBuah.length; i++) {
//            System.out.print("Input buah ke-" + (i+1) + " : ");
//            namaBuah[i] = scanner.next();
//        }
//
//        System.out.println("\n-----------------------------------------\n");
//
//        // Mencetak buah dgn perulangan
//        for (int i = 0; i < namaBuah.length; i++) {
//            System.out.println(namaBuah[i]);
//        }


        // Array List
        ArrayList kantongAjaib = new ArrayList();

        kantongAjaib.add("Apel");
        kantongAjaib.add(15);
        kantongAjaib.add(2.5);
        kantongAjaib.add('a');

        System.out.println();
        System.out.println(kantongAjaib);

        System.out.println();
        for (int i = 0; i < kantongAjaib.size(); i++) {
            System.out.println(kantongAjaib.get(i));
        }

        System.out.println();
        System.out.println("Akses 2.5 => " + kantongAjaib.get(2));
        System.out.println("Kantong ajaib berisi " + kantongAjaib.size() + " benda.");

        kantongAjaib.remove(3);
        System.out.println("\nKantong ajaib berisi " + kantongAjaib.size() + " benda.");
        System.out.println(kantongAjaib);




    }
}
