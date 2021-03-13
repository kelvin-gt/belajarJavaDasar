package KelasTerbuka;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerdanStringTokenizer {
    public static void main(String[] args) throws IOException {

        // membaca file di input2.txt dgn delim spasi
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        // mengecek apa ada kata lagi dan menggunakan pemisah spasi
        System.out.println(scanner.hasNext());

        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.hasNext());

        // membaca file di input2.txt dgn delim (",")
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200); // biar bisa nge reset baca file

        System.out.println();
        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");
        System.out.println(scanner.hasNext()); // cek apakah ada kata kata nya

        // ini akan membaca smua file yg ada sampe kosong
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        // membaca data 1 baris
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        // selain pake scanner, kita bisa pake tokenizer utk membaca 1 baris dulu
        StringTokenizer stringToken = new StringTokenizer(data,",");

        while (stringToken.hasMoreTokens()) {
            System.out.println(stringToken.nextToken());
        }

        // membaca lagi ke baris 2

        data = bufferedReader.readLine();
        stringToken = new StringTokenizer(data,",");

        while (stringToken.hasMoreTokens()) {
            System.out.println(stringToken.nextToken());
        }
    }
}
