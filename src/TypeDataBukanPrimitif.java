public class TypeDataBukanPrimitif {
    public static void main(String[] args) {
        //perbedaan type data primitif dengan type data bukan primitif adalah default value nya
        //default value type data bukan primitif adalah null;

        //ex:
        Integer iniInteger = null;
        System.out.println(iniInteger);
        iniInteger = 92;
        System.out.println(iniInteger);

        Byte iniByte = 10;
        Short iniShort = 100;
        Integer iniIntegerLagi = 1000;
        Long iniLong = 1000_000L;

        Float iniFloat = 3.14F;
        Double iniDouble = 3.146546;

        Character iniCharacter =  'A';
        String iniString = "hello";
    }
}
