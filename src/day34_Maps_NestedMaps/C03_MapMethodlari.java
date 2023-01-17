package day34_Maps_NestedMaps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap.containsValue("Ali")); //false
        //value degerinin tamamı sorulursa true, parcası sorulursa false doner

        System.out.println(ogrenciMap.getOrDefault(103, "Ogrenci bulunamadı"));
        //Ali-Cem-11-K-TM

        System.out.println(ogrenciMap.getOrDefault(123, "Ogrenci bulunamadı"));
        //Ogrenci bulunamadı

        System.out.println(ogrenciMap.get(123)); // null

        System.out.println(ogrenciMap.replace(103, "Ali-Cem-11-K-TT")); //Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TT


    }
}
