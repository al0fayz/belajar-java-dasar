public class KonversiTypeDataNumber {
    public static void main(String[] args) {
        //otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;

        //manual
        int test = 20;
        short iniTestShort = (short) test;
        byte iniTestByte = (byte) iniTestShort;
    }
}
