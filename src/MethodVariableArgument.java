public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] nilai = {
                36, 77, 80, 99, 87
        };
        say("Alfa", nilai);

        sayHasil("Beta", 78, 40, 50, 67, 78); //pemanggilan method variable arguments
    }

    //contoh method tidak menggunakan variable arguments
    static void say(String name, int[] nilai){
        var total = 0;
        for(var value : nilai){
            total += value;
        }
        var rata2 = total / nilai.length;
        if(rata2 >= 75){
            System.out.println("Selamat "+ name + " Anda Lulus!");
        }else{
            System.out.println("Maaf "+ name + " Anda Tidak Lulus!");
        }
    }
    //contoh method menggunakan variable argument

    static void sayHasil(String name, int... nilai){
        var total = 0;
        for(var value : nilai){
            total += value;
        }
        var rata2 = total / nilai.length;
        if(rata2 >= 75){
            System.out.println("Selamat "+ name + " Anda Lulus!");
        }else{
            System.out.println("Maaf "+ name + " Anda Tidak Lulus!");
        }
    }
}
