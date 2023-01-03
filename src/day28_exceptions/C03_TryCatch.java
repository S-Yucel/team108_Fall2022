package day28_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    public static void main(String[] args) {
        /*
        Kullanıcıdan toplamak uzere sayılar alın
        kullanıcının islemi bitirmesi icin Q ya basmasını isteyin
        kullanıcı q ya bastıgında kac sayı girdigini ve bu sayıların
        toplamının kac oldugunu yazdırın
         */
        Scanner scan = new Scanner(System.in);
        int girilenSayi;
        int sayiAdedi = 0;
        int sayilarToplami = 0;

        while (sayiAdedi<10000){

        try {

                System.out.println("Toplamak icin tam sayı girin" +
                        "bitirmek icin Q ya basın");

                girilenSayi= scan.nextInt();
                sayilarToplami+=girilenSayi;
                sayiAdedi++;

        } catch (InputMismatchException e) {
            String girilenDeger = scan.nextLine();
            if (girilenDeger.equalsIgnoreCase("q")){
                System.out.println("Girilen " + sayiAdedi + " sayının toplamı : " + sayilarToplami);
                break;

            }else {
                System.out.println("gecersiz input");

                }
            }
        }
    }
}
