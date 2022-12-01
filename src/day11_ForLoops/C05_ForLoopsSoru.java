package day11_ForLoops;

import java.util.Scanner;

public class C05_ForLoopsSoru {
    public static void main(String[] args) {
        /*
        Kullanıcıdan baslangic ve bitis degeri olarak pozitif sayilar alin
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdırın
        Bitis degeri baslangic degerinden kucukse, uyari yazdırıp işlemi
        sonlandırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis sayisi giriniz");
        int baslangic = scan.nextInt();
        int bitis = scan.nextInt();
        
        if (bitis<baslangic){
            System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
            
        }else {
            int toplam = 0;
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;  // tüm sayıları sırası ile toplama ekledik
            }
            System.out.println(baslangic + " ile " + bitis + 
                    " arasındaki sayıların toplamı : " + toplam);
        }
        
    }
}
