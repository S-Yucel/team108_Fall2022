package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {
        // kullanicidan 2 tamsayi alin
        // 1.tamsayiyi 2.ye bolup sonucu ondalik olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir birine bölmek için 2 tam sayı giriniz");
        int ilkSayi = scan.nextInt();
        int ikinciSayi = scan.nextInt();
        System.out.println("İki sayının bölme sonucu : " + (double) ilkSayi / ikinciSayi);


    }
}
