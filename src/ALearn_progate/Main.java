package ALearn_progate;


import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println(5 + 3);
        System.out.println("5 + 3");
        System.out.println("5" + "3");

        int age = 20;
        String name = "Kelvin";
        System.out.println("Nama ku " + name + ", berumur " + age + " tahun.");

        age = 21;
        name = "Kelvin GT";
        System.out.println("Nama ku " + name + ", berumur " + age + " tahun.");

        int angka1 = 15;
        int angka2 = 7;
        System.out.println(angka1 / angka2);
        System.out.println((float)angka1 / angka2);
        System.out.println((double)angka1 / angka2);

        int[] numbers = {1,2,3,4,5};
        String[] names = {"Kelvin","Gilbert","Tanoko"};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        numbers[0] = 0;
        names[2] = "T";
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        // Menambah data array

        numbers = Arrays.copyOf(numbers,numbers.length + 1);
        numbers[numbers.length - 1] = 6;

        names =  Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = "ZZ";

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        for (int i = 7; i <= 10; i++) {
            numbers = Arrays.copyOf(numbers, numbers.length + 1);
            numbers[numbers.length - 1] = i;
            System.out.println(Arrays.toString(numbers));
        }

        int n = 17;

        if (n > 17)
        {
            System.out.println("n lebih besar dari 17");
        }
        else if (n < 17)
        {
            System.out.println("n lebih kecil dari 17");
        }
        else
        {
            System.out.println("n == 17");
        }

        System.out.println();

        switch (n % 2)
        {
            case 0:
                System.out.println("Genap");
                break;
            case 1:
                System.out.println("Ganjil");
                break;
            default:
                System.out.println("Error");
                break;
        }

        System.out.println();

        while (n <= 20)
        {
            System.out.println("Angka " + n);
            n++;
        }

        System.out.println();

        for (int m = 10; m <= 15; m++)
        {
            if (m == 14) continue;
            System.out.println("Angka " + m);
        }

        System.out.println();

        for (int mm = 10; mm <= 15; mm++)
        {
            System.out.println("Angka " + mm);
            if (mm == 14)
            {
                System.out.println("Stop sampai disini");
                break;
            }
        }

        boolean bool = true;
        System.out.println(bool);
        System.out.println(4 + 2 == 7);
        System.out.println(4 + 2 != 7);

        for (int z = 0; z < numbers.length; z++)
        {
            System.out.println("Index ke " + z + ", bernilai " + numbers[z]);
        }


        // Teknik cetak Learn_PZN.Array lainnya "Exchanged mode"
        System.out.println();
        System.out.println("Ambil dari Learn_PZN.Array Variabel Numbers[] di  atas....");

        for (int number : numbers)
        {
            System.out.println("Number : " + number);
        }

        for (String namex : names)
        {
            System.out.println("Nama ku " + namex);
        }

        // Mencari jumlah angka pada kelompok Ganjil dan Genap
        System.out.println();

        int[] angkaa = {1,2,3,4,5,6,7,8,9,10};
        int tempGanjil = 0;
        int tempGenap = 0;

        for (int x = 0; x < angkaa.length; x++)
        {
            if (angkaa[x] % 2 == 0)
            {
                tempGenap += angkaa[x];
            }
            if (angkaa[x] % 2 != 0)
            {
                tempGanjil += angkaa[x];
            }
        }
        System.out.println("Jumlah Angka Genap : " + tempGenap);
        System.out.println("Jumlah Angka Ganjil : " + tempGanjil);

        tempGanjil = 0;
        tempGenap = 0;
        for (int angka: angkaa)
        {
            if (angka % 2 == 1)
            {
                tempGanjil += angka;
            }
            else
            {
                tempGenap += angka;
            }
        }
        System.out.println("Jumlah Angka Genap : " + tempGenap);
        System.out.println("Jumlah Angka Ganjil : " + tempGanjil);

        // Mencari nilai terkecil dan terbesar
        System.out.println();

        int minValue = angkaa[0];
        int maxValue = angkaa[0];

        for (int angkax : angkaa)
        {
            if (minValue > angkax)
            {
                minValue = angkax;
            }
        }
        System.out.println("Angka Terkecil dari array angkaa adalah : " + minValue);

        for (int j = 0; j < angkaa.length; j++)
        {
            if (maxValue < angkaa[j])
            {
                maxValue = angkaa[j];
            }
        }
        System.out.println("Angka Terbesar dari array angkaa adalah : " + maxValue);
    }
}