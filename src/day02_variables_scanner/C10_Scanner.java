package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        double sayiDbl = scan.nextDouble();
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayiInt = scan.nextInt();

        System.out.println("Sayıların toplamı : " + (sayiDbl + sayiInt));
        System.out.println("Sayıların çarpımı : " + sayiDbl * sayiInt);


    }
}
