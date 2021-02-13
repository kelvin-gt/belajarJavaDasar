package ALearn_PZN;

import java.util.HashMap;

public class CobaHashMap {
    public static void main(String[] args) {

        // HashMap adalah sebuah class yang berisi sekumpulan pasangan nilai (value) dan kunci (key).

        // membuat objek hashmap
        HashMap<Integer, String> days = new HashMap<Integer,String>();

        // mengisi nilai ke objek days
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");

        // mencetak semua isi dari objek days
        System.out.println("Isi objek days: " + days);

        // mengambil hari senin
        System.out.println("Hari kedua: " + days.get(2));

        // mengubah hari menggu menjadi hari ahad
        days.put(1, "Ahad");

        // mengubah hari rabu menjadi rabo
        days.replace(4, "Rabo");

        // mencetak semua isi dari objek days
        System.out.println("Isi objek days: " + days);
    }
}
