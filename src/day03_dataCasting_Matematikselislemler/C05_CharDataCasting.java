package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C05_CharDataCasting {
    public static void main(String[] args) {
        /*
        char data türünün ekstra bir özelliği vardır.
        eğer matematiksel bir işlemde char data türünden bir değer kullanırsak,
        Java o char ın ascii değerini gözönünde bulundurarak matematiksel işlemi gerçekleştirir
         */

        System.out.println('a' + 'b'); //97+98=195
        System.out.println('a' - 32); // 97-32=65
        System.out.println((char) ('a' - 32)); // A

        /*
        kullanıcıdan bir char alıp ascii tablodan
        ascii table'dan kullanicinin girdigi char'in sonrasindaki
        3 karakteri yazdirin
        ornek input : a output : b,c,d
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz.");
        char girilenKrk = scan.next().charAt(0);
        System.out.println((char) (girilenKrk + 1) + "," +
                (char) (girilenKrk + 2) + "," +
                (char) (girilenKrk + 3)  );
    }
}
