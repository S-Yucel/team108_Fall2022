package day23_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime zaman = LocalTime.now();
        System.out.println(zaman); //12:07:14.873815600

        System.out.println(zaman.getMinute()); //8
        System.out.println(zaman.withSecond(0).withNano(0)); // 12.08
        System.out.println(zaman.withSecond(1).withNano(1)); //12:09:01.000000001
        System.out.println(zaman.plusHours(100).plusMinutes(250)); //20:20:58.15012340

        //bir for loop ile 1 den 10000 e kadar olan sayıları yan yana yazdırın
        //bu işlem için geçen zamanı bulun

        LocalTime baslangicZamani = LocalTime.now();

        System.out.println("başlangıc " + baslangicZamani);
        for (int i = 1; i < 1000; i++) {
            System.out.println(i + " ");
        }
        LocalTime bitisZamani = LocalTime.now();
        System.out.println("");
        System.out.println("bitiş " + bitisZamani);

        System.out.println("İşlem süresi :" + (bitisZamani.getSecond() - baslangicZamani.getNano()));
        // İşlem süresi :-677675086

        /*
            Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
            olusturdugumuz satirdaki zamani veya tarih'i sistemden alip kaydeden bir variable'dir

            ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda
            yeni bir time veya date objesi olusturup
            o andaki degeri alabiliriz.
         */


    }

}
