package ALearn_progate;

public class Main2 {
    public static void main(String[] args) {

        cetakHello();
        myName("Kelvin");

        // my name fullName
        myName(fullName("Kelvin","Gilbert","T......"));
    }

    private static void cetakHello() {
        System.out.println("Hello Java");
    }

    private static void myName(String name) {
        System.out.println("Nama ku : " + name);
    }

    private static String fullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }
}