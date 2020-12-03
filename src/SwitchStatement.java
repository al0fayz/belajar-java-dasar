public class SwitchStatement {
    public static void main(String[] args) {
        //contoh statement switch
        var nilai = "A";
        switch (nilai){
            case "A":
                System.out.println("Wow Anda rajin");
                break;
            case "B":
                System.out.println("Anda lumayan berusaha");
                break;
            case "C":
                System.out.println("Anda Harus lebih semangat");
                break;
            case "D":
                System.out.println("Anda pasti kurang tidur");
                break;
            default:
                System.out.println("Anda Salah belajar");
                break;
        }

        /**
          *switch lambda
          *ini fitur baru mempermudah penggunaan switch pada java versi 14
        */
        //contoh switch lambda
        nilai = "C";
        switch (nilai){
            case "A" -> System.out.println("Anda Lulus");
            case "B", "C" -> System.out.println("Anda Hebat");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                //jika ada dua harus menggunakan kurung buka
                System.out.println("Anda Salah Ruang!");
                System.out.println("harus menggunakan kurung buka ya");
            }
        }

        //atau kita masukan ke dalam sebuah variabel
        String hasil;
        switch (nilai){
            case "A" -> hasil = "Anda lulus";
            case "B", "C" -> hasil = "Anda Hebat";
            case "D" -> hasil = "Anda tidak lulus";
            default -> hasil = "Anda Salah Ruang";
        }
        System.out.println(hasil);

        /**
         * penggunaan yield pada switch
         * perlu di ingat fitur ini baru tersedia pada jav version 14
         */
        String ucapan;
        ucapan = switch (nilai) {
            case "A":
                yield "Anda Lulus";
            case "B", "C":
                yield "Anda Hebat";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Anda salah Ruang";
        };
        System.out.println(ucapan);
    }
}
