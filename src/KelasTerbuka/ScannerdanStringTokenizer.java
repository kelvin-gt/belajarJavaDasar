package KelasTerbuka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerdanStringTokenizer {
    public static void main(String[] args) throws IOException {

        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        // ini untuk cek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext());  //true

        // untuk membaca kata, dengan pemisah/delimeter spassi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        // Menggunakan delimeter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");
        System.out.println(scanner.hasNext());

        while (scanner.hasNext())
        {
            System.out.println(scanner.next());
        }

        // Mencetak menggunakan String Tokenizer
        bufferedReader.reset();

        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data,",");

        while (stringToken.hasMoreTokens()) {

            System.out.println(stringToken.nextToken());
        }

        // lanjut cetak baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken = new StringTokenizer(data,",");

        while (stringToken.hasMoreTokens()) {

            System.out.println(stringToken.nextToken());
        }
    }
}
