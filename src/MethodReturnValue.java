public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 120;
        var b = 123;
        var c = sum(a, b);
        System.out.println(c);

        System.out.println(hitung(100, "+", 200));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "salah", 100));

    }
    static int sum(int a, int b){
        var hasil = a + b;
        return hasil;
    }
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
