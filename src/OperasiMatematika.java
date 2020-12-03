public class OperasiMatematika {
    public static void main(String[] args) {
        //contoh operasi aritmatika
        int x = 100;
        int y = 20;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        //contoh operasi Assignment
        System.out.println("================");
        int a = 20;
        a += 10;
        System.out.println(a);

        a -= 10;
        System.out.println(a);

        a *= 10;
        System.out.println(a);

        a /= 10;
        System.out.println(a);

        a %= 2;
        System.out.println(a);

        //contoh unary operator
        System.out.println("================");

        int m = +120;
        int n = -120;

        m++;
        System.out.println(m);
        m--;
        System.out.println(m);
        System.out.println(!false);
    }
}
