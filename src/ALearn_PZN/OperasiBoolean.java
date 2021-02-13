package ALearn_PZN;

public class OperasiBoolean {
    public static void main(String[] args) {

        int absen = 70;
        int nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        boolean lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);

    }
}
