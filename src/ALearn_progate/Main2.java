package ALearn_progate;

class Main2 {
    public static void main(String[] args) {
        hello();
        sapaNama("Kelvin");

        String name = fullName("Kelvin","GT");
        System.out.println("Nama ku : " + name);

        sapaNama(fullName("Kelvin","Gilbert","Tanoko"));
    }

    public static void hello() {
        System.out.println("Hello JAva");
    }

    public static void sapaNama(String name) {
        System.out.println("Nama mu : " + name);
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static String fullName(String firstName, String midleName, String lastName) {
        return firstName + " " + midleName + " " + lastName;
    }
}