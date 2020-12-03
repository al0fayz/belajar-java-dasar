public class MethodOverloading {
    public static void main(String[] args) {
        say();
        say("Alfa");
        say("Beta", "Gama");
    }
    static void say(){
        System.out.println("Hello");
    }
    static void say(String name){
        System.out.println("Hello "+ name);
    }
    static void say(String firstName, String lastName){
        System.out.println("Hello "+ firstName + " "+ lastName);
    }
}
