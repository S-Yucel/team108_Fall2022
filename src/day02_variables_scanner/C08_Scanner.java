package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk kenar uzunlugunu giriniz");
        double ilkKenar = scan.nextDouble();
        System.out.println("Lütfen ikinci kenar uzunlugunu giriniz");
        double ikinciKenar = scan.nextDouble();

        System.out.println("Diktörtgenin alani : " + ilkKenar*ikinciKenar);

    }
}
