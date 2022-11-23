package day05_ifStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan sayı alın, sayı 3 e bölünüyorsa,
        "3 ile bölünebilen sayı" , 5 ile bölünebiliorsa
        "5 ile bölünebilen sayı" yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi % 3 == 0) {
            System.out.println("3 ile bölünebilen sayı");
        }
        if (girilenSayi % 5 == 0) {
            System.out.println("5 ile bölünebilen sayı");
        }

        /*
        if cümlelerinde süslü parantez kullanmazsak ilk
         ; e kadar olan kısmı body olarak kabul eder
         eğer if body si için yazılacak kod bir satırdan fazlaysa mutlaka
         {} kullanılmalıdır
         */


    }
}
