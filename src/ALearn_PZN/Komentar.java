package ALearn_PZN;

public class Komentar {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 15;
        int total = sum(n1,n2);
        System.out.println(total);
    }


    // Ini Coment Doc = Coment Documentation


    /**
     * Method untuk menjumlahkan value1 dan value2
     * @param value1 angka pertama
     * @param value2 angka kedua
     * @return hasil penjumlahan value1 dan value2
     */

    public static int sum(int value1, int value2) {
        // Menjumlahkan nilai 1 dengan nilai 2
        return value1 + value2;
    }
}
