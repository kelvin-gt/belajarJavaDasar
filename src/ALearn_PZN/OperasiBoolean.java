package ALearn_PZN;

public class OperasiBoolean {
    public static void main(String[] args) {

        int absen = 70;
        int nilaiAhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAhir >= 80;
        boolean lulus = lulusAbsen && lulusNilai;

        if (lulus) {
            System.out.println("Anda lulus.");
        }
        else {
            System.out.println("Anda tak lulus.");
        }
    }
}
