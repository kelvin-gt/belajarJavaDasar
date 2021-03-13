package ALearn_PZN;

public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(1 * 2 * 3 * 4 * 5);
        // fungsi
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));

        System.out.println();
        loop(10);
    }

    // method/fungsi mencari factorial dgn looping
    static int factorialLoop(int value) {
        int result = 1;

        for (int counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    // method/fungsi mencari factorial dgn recursive method
    static int factorialRecursive(int value) {

        if (value == 1) {
            return value;
        }
        else {
            return value * factorialRecursive(value - 1);
        }
    }

    // tes error recursive method
    // kalo value = 10000 error
    // looping terlalu dalam menyebabkan StackOverflowError

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai.");
        }
        else {
            System.out.println("Loop " + value);
            loop(value -1);
        }
    }
}
