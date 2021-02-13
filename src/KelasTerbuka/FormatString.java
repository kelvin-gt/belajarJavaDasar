package KelasTerbuka;

public class FormatString {
    public static void main(String[] args) {

        String nama = "Kelvin";
        int umur = 20;

        System.out.println("Nama saya " + nama + ", umur saya adalah " + umur);

        // pake printf
        System.out.printf("Nama saya %s, umur saya adalah %d",nama,umur);

        System.out.println();
        int number = 1000000000;
        System.out.printf("%-,10d\n",number);
    }
}
