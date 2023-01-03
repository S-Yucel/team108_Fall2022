package day28_exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {

        /*
        Try-catch bloklarının amacı riski 0 yapmak degil,
        kodun iyi analiz yapıp javanın cozemeyecegi durumlarda
        ne yapmasını istedigimizi kendisine soylemektir.

        Java try blogunda bas edemeyecegi (handle) bir sorunla karsılasınca,
        siz o sorunu deklare edinceye kadar yani catch() satırına kadar calısmayı durdurur

        Bu durumda sorun olan satır ile catch arasındaki kodlar calısmaz
         */

        /*
        Kullanıcıdan 2 tam sayı alıp
        sayıları birbirine bolup sonucu yazdırın

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("birbirine bolmek icin 2 tam sayı giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();


        try {
            System.out.println("2 sayının bolumu : " + sayi1/sayi2);

            System.out.println("kont1");
            System.out.println("kont2");
            System.out.println("kont3");
        }catch (ArithmeticException e){
            System.out.println("Bolen 0 olamaz");
            e.printStackTrace();
        }

    }
}
