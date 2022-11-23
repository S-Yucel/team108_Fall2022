package day05_ifStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir sayı alıp pozitif ise pozitif sayı,
        100-999 arasında ise (sınırlar dahil) "pozitif 3 basamaklı sayı"
        3 ile bölünebiliyorsa "3 ün katı"
        birler basamağı 7 ise "Mükemmel"
        seçeneklerinden uygun olanı yazdırın
         */
        /*
        Basit if cümleleri kodun geri kalanından bağımsızdır
        sadece 1 şarta odaklanır şart true ise body çalışır, false ise çalışmaz
        (kodun kendisi çalışır)

        birden fazla if cümlesi kullanılmışsa her cümle birbirinden
        bağımsız olacağı için her cümleye ayrı ayrı bakılır.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif sayı giriniz");
        int sayi = scan.nextInt();

        //pozitif ise "pozitif sayı"
        if (sayi > 0) {
            System.out.println("sayı pozitif");
        }

        //100 ile 999 arasında ise (sınırlar dahil) "pozitif 3 basamaklı sayı"
        if (100<=sayi && sayi<=999){
            System.out.println("pozitif 3 basamaklı sayı");
        }

        //3 ile bölünebiliyorsa "3 ün katı"
        if (sayi % 3 == 0) {
            System.out.println("3 ün katı");
        }

        //birler basamağı 7 ise "Mükemmel"
        if (sayi % 7 == 0) {
            System.out.println("Mükemmel");
        }
        if (sayi % 7 == 0 || sayi%10==-7) {
            System.out.println("Mükemmel");
        }


    }
}
