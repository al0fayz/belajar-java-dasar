public class DoWhileLoop {
    public static void main(String[] args) {
        //contoh do while
        int counter = 100;
        do {
            System.out.println("Perulangan " + counter);
            counter++;
        }while (counter <= 10); //walaupun kondisi tidak true namun do while akan melakukan sedikitnya 1x perulangan
    }
}
