package day13_methodOverloading_WhileLoop;

import day12_MethodCreation.C03_AsalSayi;
import day12_MethodCreation.C06_TerseCevirme;
import day12_MethodCreation.C07_FibonacciSayisi;

public class C01_MethodCall {
    public static void main(String[] args) {
        // ilk 15 fibonacci sayisin yazdirin
        C07_FibonacciSayisi.fibonaccidenSayiYazdir(10);
        
        //asagida verilen cümlenin tersini yazdırın
        String str = "Bir kere yaparim yan gelir yatarim";
        System.out.println(C06_TerseCevirme.metniTerseCevir(str));
        
        //verilen cümleyi tersine çevirin dersek.atama yapar kaydederiz
        String tersStr = C06_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr);
        
        //asagida verilen cumlenin palindrom olup olmadigini yazdirin
        
        str="Java Candir";
        tersStr=C06_TerseCevirme.metniTerseCevir(str);
        if (str.equals(tersStr)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Palindrom degil");
            
            //asagida verilen sayinin asal olup olmadıgini bul
            
            int sayi=23;
            System.out.println(C03_AsalSayi.asalSayiMi(sayi));
            
            // kullanıcı true yada false anlamaz açık şekilde yazalım dersek
            
            boolean sonuc=C03_AsalSayi.asalSayiMi(sayi); //true
            
            
            if (sonuc){
                System.out.println("Girilen sayı " + sayi + " asal");
            }else {
                System.out.println("Girilen sayı " + sayi + " asal degil");
            }
        }
    }
}
