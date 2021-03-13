package KelasTerbuka;

import java.io.*;
import java.util.Arrays;

public class BufferedCharacterStream {
    public static void main(String[] args) throws IOException {

        // Membaca file dahulu
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(200);


        // Membaca string-nya
        String data = bufferedReader.readLine();
        System.out.println(data);

        // Membaca file kedlm char
        bufferedReader.reset();
        char[] dataChar = new char[25];
        bufferedReader.read(dataChar,0,25);
        System.out.println(Arrays.toString(dataChar));

        // membaca baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        // menulis file
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

        bufferedReader.reset();

        String baris1 = bufferedReader.readLine();
        bufferedWriter.write(baris1,0,25);
        bufferedWriter.flush();

        // menambah newline / enter
        bufferedWriter.newLine();

        String baris2 = bufferedReader.readLine();
        bufferedWriter.write(baris2,0,23);
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
        fileInput.close();
        fileOutput.close();
    }
}
