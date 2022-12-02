package day13_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C06_SifreKontrolu {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir şifre isteyip aşağıdaki şartları kontrol edelim
        ve kullanıcıya düzeltmesi gereken tüm eksiklikleri bildirelim
        eger tüm şartları yerine getirdiyse "şifre başarıyla kaydedildi" yazdırın
        -ilk harf küçük harf olmalı
        -son karakter rakam olmalı
        -şifre boşluk içermemeli
        -uzunlugu en az 10 karakter olmalı
        
        şifre kontrolunu bir method da yapıp true yada false dondurun
        main method da donen sonucu kontrol edip "başarı ile oluşturuldu" 
        yazıncaya kadar şifreyi tekrar tekrar isteyin
         */
        
        Scanner scan = new Scanner(System.in);
        boolean tekrarSifreIste = true;
        String sifre = "";
        
        while (tekrarSifreIste){
            System.out.println("Lütfen şifrenizi giriniz");
            sifre= scan.nextLine();
            if (sifreKontrolEt(sifre)){ //sifre kontrolu true dönerse sifre basarili demektir
                System.out.println("şifre başarı ile oluşturuldu");
                //break;
                //yada
                tekrarSifreIste = false;
                
            }
        }
        

    }

    public static boolean sifreKontrolEt(String sifre){
    int flag = 0;
    //- ilk harf kucuk harf olmali
        if (!(sifre.charAt(0)>= 'a' && sifre.charAt(0)<='z' )){
        //ilk harf kucuk degilse hatayi yazdir
        //sifre.charAt(0)<'a' || sifre.charAt(0)>'z'
        System.out.println("ilk harf kucuk harf olmali");
        flag++;
    }
    //- son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>'0' && sifre.charAt(sifre.length()-1)<='9')){
        //son karakter rakam degilse
        System.out.println("Son karakter rakam olmali");
        flag++;
    }
    //- sifre bosluk icermemeli
        if (sifre.contains("  ")) {
        System.out.println("Sifre bosluk icermemeli");
        flag++;
    }
    //- uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){
        System.out.println("sifre en az 10 karakterden olusmali");
        flag++;
        }
        if (flag==0) {
            return true;
        }else {
            return false;
        }
    }

}
