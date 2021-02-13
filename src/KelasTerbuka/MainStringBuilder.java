package KelasTerbuka;

public class MainStringBuilder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Halo");
        printData(builder);

        // append
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga surabaya");
        printData(builder);

        // insert
        builder.insert(19, " Kota");
        printData(builder);

        // delete
        builder.delete(19,23);
        printData(builder);

        // rubah character pada index tertentu
        builder.setCharAt(14, 'W');
        printData(builder);

        // replace
        builder.replace(20,28,"Bandung");
        printData(builder);

    }

    private static void printData(StringBuilder dataBuilder) {

        System.out.println("Data      : " + dataBuilder);
        System.out.println("Panjang   : " + dataBuilder.length());
        System.out.println("Kapasitas : " + dataBuilder.capacity()); // kapasitas defaultnya 16. jd 20 ditambah 4 kata halo

        // Cek memori
        int addresBuilder = System.identityHashCode(dataBuilder);
        System.out.println("Memori    : " + Integer.toHexString(addresBuilder));
    }
}
