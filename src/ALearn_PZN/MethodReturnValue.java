package ALearn_PZN;

public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println(hitung(100,"+",100));
        System.out.println(hitung(100,"-",50));
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
