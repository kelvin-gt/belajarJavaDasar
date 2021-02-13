package KelasTerbuka;

import java.util.Scanner;

public class OperasiString {
    public static void main(String[] args) {

        String kalimat = "Saya suka makan pisang";

        // Mengambil komponen String
        System.out.println(kalimat.charAt(5));

        // Substring
        String kata = kalimat.substring(10,15);
        System.out.println(kata);

        // Concatenetion (concat)
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);

        kata = kata + " cireng";
        System.out.println(kata);

        // Concat dgn non String
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;  // Casting
        System.out.println(kalimat3);

        // Lowercase, Uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // Replace
        String kalimat4 = kalimat.replace("pisang","combro");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        // Equality (persamaan)
        String kataInput = "test"; // di String pool
        String kataTest = "test";  // di String pool

        System.out.println("\nCek kesamaan");
        if (kataInput == kataTest) {
            System.out.println("Sama");
        }
        else {
            System.out.println("Beda");
        }
        //akan beda kataInput dan kataTest jika dibuat gini. String kataInput = new String("test");

        Scanner userInput = new Scanner(System.in);
        System.out.print("\nMengambil input string dari user kalo mau sama kata test : ");
        kataInput = userInput.next();

        System.out.println("Ini adalah inputan user : " + kataInput);

        if (kataInput.equals(kataTest))
        {
            System.out.println("Yah Sama");
        }
        else
        {
            System.out.println("Yah Beda");
        }

        // compare
        String motor1 = "royal sakdafjbs";
        String motor2 = "kawasaki";

        System.out.println("\nCompare motor dilihat dari alpahabetik huruf awal r dan k");
        System.out.println(motor1.compareTo(motor2));

        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";

        System.out.println(gorengan1.compareTo(gorengan2));
    }
}
