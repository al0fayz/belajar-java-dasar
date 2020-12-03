public class Continue {
    public static void main(String[] args) {
        //contoh continue
        for(int x = 1; x <= 10; x++){
            if(x % 2 == 0){
                continue;
            }
            System.out.println("Perulangan "+x);
        }

    }
}
