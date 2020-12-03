public class Array {
    public static void main(String[] args) {
        // contoh Array
        String[] contohArray;
        contohArray = new String[3];
        contohArray[0] = "Alfa";
        contohArray[1] = "Code";
        contohArray[2] = "Saja";

        System.out.println(contohArray[0]);
        System.out.println(contohArray[1]);
        System.out.println(contohArray[2]);

        //atau
        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        //atau
        Long[] arrayLong = {
                1000L, 200L
        };

        //panjang array
        System.out.println(arrayInt.length);
        System.out.println(arrayLong.length);


        /* Array Multi Dimensi*/
        String[][] nama = {
                {"nama", "Saya"},
                {"alfa", "beta", "gama"},
                {"jadi"}
        };
        System.out.println(nama[1][1]);
    }
}
