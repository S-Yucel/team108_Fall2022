package day13_methodOverloading_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {
        /*
        random olarak 1 ile 100 arasinda bir sayı oluştur
        kullanıcıdan bu sayıyı bilmesini iste
        kullanıcı her deger girdiginde tuttugun sayı ile karşılaştırıp tahmini
        büyüt yada küçült diyelim
        kullanıcı tuttugumuz sayıyı bildiginde tahmin sayısını ve
        
        -3 veya daha az tahminde bildiyse "woouuww"
        -4 ile 8 arası tahminde bildiyse "aferin"
        -daha fazla tahminde bildiyse "başarısız" yazdırın
         */

        Random rnd = new Random();
        int tutulansayi = rnd.nextInt(100);
        int sayac =1;
        int tahmin = 0;
        System.out.println(tutulansayi);

        Scanner scan = new Scanner(System.in);

        while (tutulansayi!= tahmin){
            System.out.println("Lütfen bir tahmin giriniz");
            tahmin = scan.nextInt();


            if (tutulansayi==tahmin){
                System.out.println(sayac + " tahmin ile tuttugum sayiyi buldun");
                if (sayac<=3){
                    System.out.println("Vaouwwwwwwwwwww");
                } else if (sayac<=8) {
                    System.out.println("Aferin");
                }else {
                    System.out.println("Basarisiz");
                }
                break;
            } else if (tahmin<tutulansayi) {
                System.out.println("Sayiyi buyut");
                sayac++;
            }else {
                System.out.println("Sayiyi kucult");
            }


        }
    }
}
