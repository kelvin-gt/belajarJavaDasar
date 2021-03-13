package KelasTerbuka;

public class FormatString {
    public static void main(String[] args) {

        String nama = "Kelvin";
        int umur = 20;

        System.out.println("Nama saya adalah " + nama + ", umur " + umur + " tahun.");

        // pake printf
        System.out.printf("\nNama saya adalah %s, umur %d tahun.",nama,umur);

        int number = 1000000000;
        System.out.println("\n");

        System.out.printf("%-,10d",number);
    }
}
