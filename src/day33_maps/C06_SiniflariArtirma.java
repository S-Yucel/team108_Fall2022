package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArtirma {
    public static void main(String[] args) {
        /*
        ogrenci map indeki tum sınıf degerlerini 1 artırın
        12. sınıfta olan varsa sınıf bilgisini mezun yapın
         */

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap=MapMethodDepo.siniflariArtir(ogrenciMap);
        MapMethodDepo.tumListeYazdir(ogrenciMap);


    }
}
