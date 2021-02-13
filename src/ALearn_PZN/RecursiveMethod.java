package ALearn_PZN;

public class RecursiveMethod {

    public static void main(String[] args) {

        System.out.println("Menghitung factorial");
        System.out.println("--------------------");
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));

        loop(10);
    }

    // loop biasa
    static int factorialLoop(int value)
    {
        int result = 1;

        for (int counter = 1; counter <= value; counter++)
        {
           result *= counter;
        }

        return result;
    }

    // loop recursive method
    static int factorialRecursive(int value2)
    {
        if (value2 == 1)
        {
            return value2;
        }
        else
        {
            return value2 * factorialRecursive(value2 - 1);
        }
    }

    // tes error method recursive

    static void loop(int value3)
    {
        if (value3 == 0)
        {
            System.out.println("Selesai.");
        }
        else
        {
            System.out.println("Loop " + value3);
            loop(value3 - 1);
        }
    }
}
