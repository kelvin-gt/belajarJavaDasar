package ALearn_PZN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBuah {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] buah = new String[5];

        // Membuat inputan ke data arrray
        for (int i = 0; i < buah.length; i++) {
            System.out.print("Masukkan Buah ke " + (i+1) + ": ");
            buah[i] = scanner.nextLine();
        }

        System.out.println("\n-----------------------------------------\n");

        // Mencetak buah dgn perulangan

        System.out.println(Arrays.toString(buah));

        for (int i = 0; i < buah.length; i++) {
            System.out.println("Buah" + ": " + buah[i]);
        }

        // Array List
        ArrayList kantongAjaib = new ArrayList();

        kantongAjaib.add("Senter");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(123.43);
        kantongAjaib.add(true);

        kantongAjaib.remove("tikus");

        System.out.println();
        System.out.println(kantongAjaib);
        System.out.println("Kantong ajaib berisi : " + kantongAjaib.size() + " benda.");
        System.out.println(kantongAjaib.get(0));



    }
}
