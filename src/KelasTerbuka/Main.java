package KelasTerbuka;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        // Java awal
        System.out.println("Hello Java");
        System.out.print("Hello Java lagi");
        System.out.printf("\nHello Java lagi...");

        System.out.println(5 + 3);
        System.out.println("5" + "3");
        System.out.println("5 + 3");
        System.out.println(5 / 3);
        System.out.println((float)5 / 3);
        System.out.println((double)5 / 3);

        // print ini genap atau ganjil
        System.out.println();
        int value1 = 21;

        switch (value1 % 2) {
            case 0:
                System.out.println("Angka ini genap...");
                break;
            case 1:
                System.out.println("Angka ini ganjil...");
                break;
            default:
                System.out.println("Angka tidak terdeteksi");
                break;
        }

        // test boolean
        System.out.println();
        boolean bool = true;

        System.out.println(bool);
        System.out.println(4 + 2 != 6);
        System.out.println(4 + 2 == 6);

        // test while
        System.out.println();
        value1 = 15;

        while (value1 <= 20) {
            System.out.println(value1);
            value1++;
        }

        // belajar continue dan break
        System.out.println();
        for (int i = 15; i <= 20; i++) {
            if (i == 18) continue;
            System.out.println(i);
        }

        System.out.println();
        for (int i = 15; i <= 20; i++) {
            System.out.println(i);
            if (i ==  19) break;
        }

        // belajar char dan if else if else
        System.out.println();
        int nilai = 50;
        char indexPrestasi;

        if (nilai >= 85) {
            indexPrestasi = 'A';
        }
        else if (nilai >= 75) {
            indexPrestasi = 'B';
        }
        else if (nilai > 65) {
            indexPrestasi = 'C';
        }
        else {
            indexPrestasi = 'D';
        }
        System.out.println("Nilai kamu " + nilai + ", dengan indexPrestasi " + indexPrestasi);

        // mencari jumlah ganjil, kemudian genap di array
        System.out.println();
        int tempGanjil = 0;
        int tempGenap = 0;

        int[] angka = {31,22,4,17,19,22,11};

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 1) {
                tempGanjil += angka[i];
            }
            else {
                tempGenap += angka[i];
            }
        }
        System.out.println("SUM angka ganjil = " + tempGanjil);
        System.out.println("SUM angka genap  = " + tempGenap);

        // sama dgn diatas cuma pake foreach
        System.out.println();

        tempGanjil = 0;
        tempGenap = 0;

        for (int angkaz: angka) {
            if (angkaz % 2 == 0) {
                tempGenap += angkaz;
            }
            else {
                tempGanjil += angkaz;
            }
        }
        System.out.println("SUM angka ganjil = " + tempGanjil);
        System.out.println("SUM angka genap  = " + tempGenap);

        // cari nilai min, dan max dari array
        System.out.println();

        int min = angka[0];
        int max = angka[0];
        int sumValue = 0;

        for (int i = 0; i < angka.length; i++) {
            if (min > angka[i]) {
                min = angka[i];
            }
            if (max < angka[i]) {
                max = angka[i];
            }

            sumValue += angka[i];
        }
        System.out.println(Arrays.toString(angka));
        System.out.println("Angka Terkecil  = " + min);
        System.out.println("Angka Terbesar  = " + max);
        System.out.println("Jumlah Angka    = " + sumValue);

        // sama diatas cuma pake foreach
        System.out.println();

        min = angka[0];
        max = angka[0];
        sumValue = 0;

        for (int angkas: angka) {
            if (min > angkas) {
                min = angkas;
            }
            if (max < angkas) {
                max = angkas;
            }

            sumValue += angkas;
        }
        System.out.println(Arrays.toString(angka));
        System.out.println("Angka Terkecil  = " + min);
        System.out.println("Angka Terbesar  = " + max);
        System.out.println("Jumlah Angka    = " + sumValue);

        // mebuat sgitiga siku"
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ",(j+1));
            }
            System.out.println();
        }

        // membuat segitiga siku" terbalik
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }

        //

        // membuat sgitiga siku" mirror dan terbaliknya

        // membuat segitiga sama sisi

        // membuat segitiga sama sisi terbalik

        // membuat diamond

        // Swicth Case biasa
        var nilaix = "A";

        switch (nilaix) {
            case "A":
                System.out.println("Nilai Anda Baik Sekali.");
                break;

            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik.");
                break;

            case "D":
                System.out.println("Nilai Anda Buruk.");
                break;
            default:
                System.out.println("Error...");
                break;
        }

        // Switch Case Lambda ada sjak java 14
        System.out.println();

        switch (nilaix) {
            case "A" -> System.out.println("Nilai kamu baik sekali....");
            case "B" -> System.out.println("Nilai kamu cukup..........");
            case "C" -> System.out.println("Nilai kamu kurang.........");
            default -> System.out.println("Error");
        }

        nilaix = "C";
        String ucapan;

        switch (nilaix) {
            case "A" -> ucapan = "Nilai kamu baik sekali.";
            case "B","C" -> ucapan = "Nilai kamu cukup baik.";
            case "D" -> ucapan = "Nilai kamu kurang.";
            default -> ucapan = "Anda tidak lulus.";
        }

        System.out.println("\n" + ucapan);

        // Switch Case Yield
        // Cocok utk switch expression di banding sebelumnya ^
        System.out.println();

        ucapan = switch (nilaix) {
            case "A":
                yield "Nilai kamu baik sekali.";
            case "B":
                yield "Nilai kamu cukup baik.";
            case "C":
                yield "Nilai kamu kurang.";
            default:
                yield "Nilai kamu tidak cukup tuk lulus.";
        };

        System.out.println(ucapan);

        // Ternary operator cek if else
        var nilaixx = 74;
        ucapan = nilaixx >= 75 ? "Anda lulus." : "Anda tidak lulus.";

        System.out.println("\n" + ucapan);
    }
}
