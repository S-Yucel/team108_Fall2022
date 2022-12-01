package day10_StringManipulations;

import java.util.Scanner;

public class C02_SifreKontrol {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin 
        ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, 
        eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String sifre =scan.nextLine();
        /*
        Bu soruda şartları bagımsız if cümlesi ile yapmak
        veya else if  ile yapmak mümkündür
        
        eğer if else ile yaparsak ilk hatayı bulduğunda 
        diğer şartları kontrol etmez.
        Avantajlı tarafı hata yoksa otomatik olarak işlem başarılı diyebilir
        
        bagımsız if cümlelerinde tüm hataları bir kerede soyleyebiliriz
        ancak bagimsiz if cumleleri kodun geriye kalani ile ilgilenmediginden
        basarili sifre olusturuldugunu bizim ayri bir mekanizma ile kontrol etmemiz gerekir
        
        Sonucta basarili sifre olusturuldu demek icin bir kontrol 
        mekanizması olusturmamiz gerekir.Ya her adimda artiracagimiz 
        bir sayac yapip en son 4 oldu ise basarili deriz.
        veya basta verdigimiz deger olumsuz oldugunda artirilir.en sonunda
        kotrol edip eger bastaki degeri hala koruyorsa basarili olmustur 
        diyebiliriz
         */
        
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

        System.out.println(flag);
         
        if (flag==0){
            System.out.println("Giriş işlemi başarılı");
        }
        
        
    }
}
