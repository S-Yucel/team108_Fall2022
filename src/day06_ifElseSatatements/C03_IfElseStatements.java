package day06_ifElseSatatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir harf isteyin, girilen karakter 
        kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);

        if(girilenKarakter >= 'a' && girilenKarakter <= 'z') {

            System.out.println("girilen karakter :" + (char)(girilenKarakter- 32));
            //veya
            System.out.println(Character.toUpperCase(girilenKarakter));
        } else {
            System.out.println("girilen karakter : " + girilenKarakter);
        }
    }
}
