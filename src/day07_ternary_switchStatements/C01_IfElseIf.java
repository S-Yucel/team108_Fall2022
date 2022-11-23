package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir tam sayı alın
        sayı rakam ise "Girilen sayı rakam"
        sayı 2 basamaklı ise "Girilen sayı iki basamaklı"
        sayı 2 basamaktan büyük ise "Büyük sayı" yazdırın
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int girilenSayi = scanner.nextInt();

        if (0<girilenSayi && girilenSayi<=9) {
            System.out.println("Girilen sayı rakam");
        } else if (10<girilenSayi && girilenSayi<=99) {
            System.out.println("Girilen sayı iki basamaklı");
        } else if (girilenSayi>=100) {
            System.out.println("Büyük sayı");
        }
    }
}
