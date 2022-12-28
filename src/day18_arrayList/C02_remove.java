package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler.remove("Z"));// true / Z yi bulup siler 
        System.out.println(harfler); //[A, T]

        System.out.println(harfler.remove(0));// 0 ıncı indexteki elementi siler ve gorevi tamamlayıp 
        // silinen elementi dondurur
        System.out.println(harfler); //[T]
        
        List<String> yeniList = new ArrayList<>();
        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");

        System.out.println(yeniList.removeAll(harfler));//true
        //harfler listesindeki tum elementleri yeniList den siler 
        //gorevei tamamlarsa true yoksa false doner
        System.out.println(yeniList); //[C, D]
    }
}
