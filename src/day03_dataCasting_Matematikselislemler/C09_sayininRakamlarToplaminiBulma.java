package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C09_sayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip
        // rakamlar toplamini bulalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 rakamlı pozitif bir sayı giriniz");
        int girilenSayi = scan.nextInt(); // 2457

        // soru için lazım olan varibleları hazırlayalım
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        // sırasıyla her bir basamağı elde edip rakamlar toplamına ekleyelim.

        birlerBasamagi = girilenSayi % 10; // 7
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // 0+7=7
        girilenSayi= girilenSayi /10; //245

        birlerBasamagi = girilenSayi % 10; // 5
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // 7+5=12
        girilenSayi= girilenSayi /10; //24

        birlerBasamagi = girilenSayi % 10; // 4
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // 12+4=16
        girilenSayi= girilenSayi /10; //2

        birlerBasamagi = girilenSayi % 10; // 2
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // 16+2=18
        girilenSayi = girilenSayi / 10; // 0

        System.out.println("Girilen sayının rakamlar toplamı : " + rakamlarToplami);


    }
}
