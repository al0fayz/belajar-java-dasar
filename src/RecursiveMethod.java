public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));

        //apakah sama
        System.out.println(factorialRecursive(5));
    }

    //contoh factorial tanpa recursive
    static int factorialLoop(int nilai){
        var result = 1;
        for(var a = 1; a <= nilai; a++){
            result *= a;
        }
        return  result;
    }
    /**
     * recursive method adalah suatu method yg memanggil dirinya sendiri
     */
    //contoh factorial menggunakan recursive
    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        }else{
            return value * factorialRecursive(value - 1);
        }
    }
}
