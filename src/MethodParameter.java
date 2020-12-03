public class MethodParameter {
    public static void main(String[] args) {
        //panggil method
        sayHello("Alfa", "Code");
        sayHello("Nurul", "Hikmah");
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello, "+firstName + " " + lastName);
    }
}
