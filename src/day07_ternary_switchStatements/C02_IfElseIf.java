package day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir tam sayı alın
        sayı rakam negatif  ise "Girilen sayı negatif"
        sayı 2 basamaklı ise "Girilen sayı rakam"
        sayı 2 basamaktan büyük ise "Büyük sayı" yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        if (girilenSayi<0) {
            System.out.println("Negatif sayi");
        } else if (girilenSayi<=9) {
            System.out.println("Girilen sayi rakam");
        } else if (girilenSayi<=99) {
            System.out.println("Girilen sayi 2 basamakli");
        } else {
            System.out.println("buyuk sayi");
        }
    }
}
