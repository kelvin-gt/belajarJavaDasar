package KelasTerbuka;

import java.util.Scanner;

public class TryExceptionFinally {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = {0,1,2,3,4};

        System.out.print("Index : ");
        int index = scanner.nextInt();

        // Exception handling

        try
        {
            System.out.printf("Index ke-%d, adalah %d\n", index,array[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println(e);
        }
        finally
        {
            System.out.println("finnaly");
        }

        System.out.println("\nAkhir dari program");
    }
}
