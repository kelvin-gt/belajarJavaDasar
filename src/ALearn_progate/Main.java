package ALearn_progate;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        System.out.println("Hello Java");
        System.out.print("Hello Java2");
        System.out.printf("\nHello Java3\n");

        System.out.println(5 + 3);
        System.out.println("5 + 3");
        System.out.println("5" + "3");
        System.out.println(20 / 7);
        System.out.println((float) 20 / 7);

        int age = 20;
        String name = "Kelvin";
        System.out.println("Nama ku " + name + ", umur " + age);

        age = 21;
        name = "Kelvin GT";
        System.out.printf("Nama ku %s, umur %d",name,age);

        int[] numbers = {1,2,3,4,5,6,7,8};
        String[] names = {"Kelvin","Gilbert","Tanoko"};
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        numbers[0] = 0;
        names[2] = "T";
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        // Menambah array dgn copy
        numbers = Arrays.copyOf(numbers, numbers.length + 1);
        numbers[numbers.length - 1] = 9;
        System.out.println(Arrays.toString(numbers));

        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = "ZZ";
        System.out.println(Arrays.toString(names));

        // Perulangan copyArray
        for (int i = 10; i <= 15; i++) {
            numbers = Arrays.copyOf(numbers, numbers.length + 1);
            numbers[numbers.length - 1] = i;
        }
        System.out.println(Arrays.toString(numbers));

        int n = 15;
        if (n < 17) {
            System.out.println("Anggka lbih kecil dari 17");
        }
        else if (n > 17) {
            System.out.println("Anggka lebih besar dari 17");
        }
        else {
            System.out.println("Anggka == 17");
        }

        // Ngecek genap / ganjil
        switch (n % 2) {
            case 0:
                System.out.println("Anggka ini genap");
                break;
            case 1:
                System.out.println("Anggka ini ganjil");
                break;
            default:
                System.out.println("Tidak terdeteksi...");
                break;
        }

        // Ngulang angka dari 15 ke 20
        while (n <= 20) {
            System.out.println(n);
            n++;
        }

        // continue
        System.out.println();
        for (int a = 15; a <= 20; a++) {
            if (a == 18) continue;
            System.out.println("Angka ke-" + a);
        }

        // break
        System.out.println();
        for (int a = 15; a <= 20; a++) {
            System.out.println("Angka ke-" + a);
            if (a ==  19) {
                System.out.println("Anggka stop sampa disini");
                break;
            }
        }

        System.out.println("\nBolean");
        System.out.println("------------------------");

        boolean bool = true;
        System.out.println(bool);
        System.out.println(7 + 3 == 10);
        System.out.println(7 + 3 != 10);

        // Jenis perulangan FOR
        System.out.println("\nPrint isi Array dgn perulangan FOR");
        for (int m = 0; m < numbers.length; m++) {
            System.out.println("Print Array di Numbers[], index ke- " + m + ": " +numbers[m]);
        }

        System.out.println("\nPrint isi Array dgn perulangan FOR EACH");
        for (int number: numbers) {
            System.out.println("Print Array di Numbers[] : " + number);
        }

        System.out.println("\nPrint Array Names");
        for (String namex: names) {
            System.out.printf(namex + " ");
        }

        // Mencari jumlah angka pada kelompok Ganjil dan Genap
        System.out.println();
        int tempGanjil = 0;
        int tempGenap = 0;

        for (int numberz : numbers) {
            if (numberz % 2 == 1) {
                tempGanjil += numberz;
            }
            else
            {
                tempGenap += numberz;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Jumlah angka ganjil di Array Numbers : " + tempGanjil);
        System.out.println("Jumlah angka genap di Array Number   : " + tempGenap);

        // Mencari anggka terkecil dan terbesar di Array Numbers
        System.out.println();

        int minValue = numbers[0];
        int maxValue = numbers[0];

        for (int numberss: numbers) {
            if (minValue > numberss) {
                minValue = numberss;
            }
        }
        System.out.println("Nilai Terkecil : " + minValue);

        for (int numberzz: numbers) {
            if (maxValue < numberzz) {
                maxValue = numberzz;
            }
        }
        System.out.println("Nilai terbesar : " + maxValue);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.max(4,3));

    }
}