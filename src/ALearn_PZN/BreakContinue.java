package ALearn_PZN;

public class BreakContinue {
    public static void main(String[] args) {

        var nilai = 1;

        while (true) {
            System.out.println("Perulangan " + nilai);
            nilai++;

            if (nilai > 10) break;
        }
        System.out.println("Perulangan berhenti.");


        System.out.println();
        for (int i = 1; i <= 20; i++)
        {
            if (i % 2 == 1)
            {
                continue;
            }

            System.out.println("Perulangan Genapa " + i);
        }
    }
}
