public class KonversiTypeDataBukanPrimitif {
    public static void main(String[] args) {
        // konversi type data bukan primitif

        // a. konversi primitif ke bukan primitif dengan type data yg sama
        int iniInt = 200;
        Integer iniInteger = iniInt;

        byte inibyte = 20;
        Byte iniByte = inibyte;

        // b. konversi dengan type data yang berbeda
        int nilai = 98;
        Integer to = nilai; //harus di konversi ke bukan primitif dulu
        Byte toByte = to.byteValue();
        Short toShort = to.shortValue();
        Long toLong = to.longValue();

    }
}
