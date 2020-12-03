public class ForEach {
    public static void main(String[] args) {
        //contoh penggunaan for each
        String[] dataNames = {
                "bella", "Alfa", "Beta", "Gama", "Zeta"
        };
        //tanpa for each
        System.out.println("Tanpa For Each");
        for(int a = 0; a < dataNames.length; a++){
            System.out.println("Nama :" + dataNames[a]);
        }

        //menggunakan foreach
        System.out.println("Menggunakan For Each");
        for(var nama : dataNames){
            System.out.println("Nama :" + nama);
        }
    }
}
