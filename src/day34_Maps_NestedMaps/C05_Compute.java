package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {
        Map<String,Integer> harfSayilariMap = new TreeMap<>();
        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap); //{A=10, C=15, D=3, K=5}

        //A nın kullanım miktarını 20 yapın
        harfSayilariMap.put("A",20);

        //C nin kullanım miktarını 2 katına cıkar dersek
        harfSayilariMap.put("C",harfSayilariMap.get("C")*2);
        System.out.println(harfSayilariMap); //{A=20, C=30, D=3, K=5}

        // D nin miktarını 5  artıralım
        harfSayilariMap.compute("D",(k,v) -> v+5);
        System.out.println(harfSayilariMap); //{A=20, C=30, D=8, K=5}

        // eger mapte T varsa kullanım miktarını 3 eksiltin
        harfSayilariMap.computeIfPresent("T",(k,v)->v-3);
        System.out.println(harfSayilariMap); //{A=20, C=30, D=8, K=5}

        // eger mapte K varsa kullanım miktarını 2 eksiltin
        harfSayilariMap.computeIfPresent("K",(k,v)->v-2);
        System.out.println(harfSayilariMap); //{A=20, C=30, D=8, K=3}

        // eger mapte T yoksa kullanım miktarını 3 olarak ekleyin
        harfSayilariMap.computeIfAbsent("T",v->3);
        System.out.println(harfSayilariMap); //{A=20, C=30, D=8, K=3, T=3}

    }
}
