public class IfStatement {
    public static void main(String[] args) {
        //contoh if
        int nilai = 86;
        int absen = 76;
        if(nilai >= 85 && absen >= 85){
            System.out.println("Nilai Anda A");
        }else if(nilai >= 75 && absen >= 75){
            System.out.println("Nilai Anda B");
        }else if(nilai >= 65 && absen >= 65){
            System.out.println("Nilai Anda C");
        }else if(nilai >= 55 && absen >= 55){
            System.out.println("Nilai Anda D");
        }else {
            System.out.println("Nilai Anda E");
        }
    }
}
