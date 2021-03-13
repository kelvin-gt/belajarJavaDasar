package ALearn_PZN;

public class Scope {
    public static void main(String[] args) {

        // fungsi
        hello("Kelvin");
        System.out.println();
        hello("");
    }

    static void hello(String name) {
        System.out.println("Hello " + name);

        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }
    }
}
