package day27_overriding;

public class GExeptions {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;

        // bolen sayının 0 olması bu kodda öngerilebilecek bir riskdir
        // ve kodumuzu yazarken bu riski cozecek şekilde kod yazabiliriz
        if (b != 0){
            System.out.println("iki sayının bolumu : " + a/b);
        }else {
            System.out.println("Bolecek sayı 0 olamaz");
        }


    }
}
