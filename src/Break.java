public class Break {
    public static void main(String[] args) {
       //contoh break
       int counter = 1000;
       while(counter > 10){
           if(counter == 998){
               break;
           }
           System.out.println("Perulangan " + counter);
           counter--;
       }
    }
}
