package day32_sets_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {
    //bize ogrenciMap donduren bir method oluşturun

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap= new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {
        //soyisimleri buyuk harf yap
        //1-EntrySet olusturalım
        Set<Map.Entry<Integer, String>> entrySet = ogrenciMap.entrySet();

        //2-foreach ile her bir entry elden gecirip soyisimleri buyuk harf yapalım
        for (Map.Entry<Integer, String> eachEntry : entrySet) {

            //3-entryden value alalım
            String entryValue = eachEntry.getValue();

            //4-soyisim bilgisine ulasıp degistirebilmek için parcala
            String[] entryValueArr = entryValue.split("-");

            //5-soyismi buyuk harf yapalım
            entryValueArr[1] = entryValueArr[1].toUpperCase();

            //6-degisikligi yaptıktan sonra yeniden birleştirmeleri yapıp
            // map i update etmeliyiz

            //7- setValue() kullanarak value yi yeni haline update edelim
            eachEntry.setValue(entryValueArr[0]+"-"+
                    entryValueArr[1]+"-"+
                    entryValueArr[2]+"-"+
                    entryValueArr[3]+"-")  ;
        }

        return ogrenciMap;
    }

    public static void tumListeYazdir(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }
    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String s) {
    }

    public static void numaraIleSubeDegistirme(Map<Integer, String> ogrenciMap, int i, String m) {

    }

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {
        //mapte istedigimiz degisikligi yaptıktan sonra,
        // mapi update etmenin en kolay yolu setEntry()

        Set<Map.Entry<Integer,String>> entrySet = ogrenciMap.entrySet();
        for (Map.Entry<Integer,String> eachEntry : entrySet){
            String entryValue= eachEntry.getValue();
            String[] entryValueArr= entryValue.split("-");

            int sinifInt = Integer.parseInt(entryValueArr[2]);

            if (sinifInt==12){
                entryValueArr[3]="Mezun";
            }else {
                entryValueArr[3]=sinifInt+1+"";
            }
            //sınıf bilgisini guncelledik
            //bu güncellemeyi mape işlememiz lazım

            // mapi guncellemenin en kolay yolu olan
            eachEntry.setValue(entryValueArr[0]+"-"+
                    entryValueArr[1]+"-"+
                    entryValueArr[2]+"-"+
                    entryValueArr[3]+"-"+
                    entryValueArr[4]+"-");

        }
        return ogrenciMap;
    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String tm) {
    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
    }
}
