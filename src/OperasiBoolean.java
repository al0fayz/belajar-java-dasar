public class OperasiBoolean {
    public static void main(String[] args) {
        //contoh opearasi boolean
        boolean a = true;
        boolean b = true;
        boolean c = false;

        //and &&
        System.out.println(a && b);
        System.out.println(a && c);
        System.out.println(b && c);

        //or ||
        System.out.println(a || b);
        System.out.println(a || c);
        System.out.println(b || c);

        //not !
        System.out.println(!a);
        System.out.println(!b);
        System.out.println(!c);


        //example
        int absen = 60;
        int nilai = 90;

        boolean absenBool = absen >= 75;
        boolean nilaiBool = nilai >= 75;

        var lulus = absenBool && nilaiBool;
        System.out.println(lulus);
    }
}
