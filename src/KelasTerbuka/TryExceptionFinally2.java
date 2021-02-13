package KelasTerbuka;

import java.util.Scanner;

public class TryExceptionFinally2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int[] arrayData = {0,1,2,3};

        System.out.print("Data ke : ");
        int indexInput = userInput.nextInt();

        // Exception Biasa
        System.out.println("Ini Exception Biasa");
        try
        {
            System.out.printf("Ini data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
        }
        catch (Exception e)
        {
            System.err.println(e);
        }

        // Exception dalam Fungsi
        System.out.println("Ini Exception dalam Fungsi");
        int data = ambilDataArray(arrayData, indexInput);
        System.out.printf("Ini data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);

        System.out.println("Akhir dari program...");
    }

    private static int ambilDataArray(int[] array, int index) {
        int hasil = 0;

        try
        {
            hasil = array[index];
        }
        catch (Exception e)
        {
            System.err.println(e);
        }

        return hasil;
    }
}
