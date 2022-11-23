package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C07_DataCasting {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir double, bir  tamsayi alin,
        // double sayiyi tam sayiya bölün
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        double sayiDbl = scan.nextDouble();

        System.out.println("Lütfen bir tamsayi giriniz");
        int sayiInt = scan.nextInt();

        System.out.println(sayiDbl/sayiInt);

        System.out.println((int) (sayiDbl/sayiInt));



    }

}
