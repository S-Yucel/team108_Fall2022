package day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_İstenmeyenHarfleriSilKalaniListeOlarakVer {
    public static void main(String[] args) {
        /*
         Verilen String bir listede istenmeyen harf iceren elementleri silip, 
         kalan kismini list olarak bize donduren bir method olusturun
         */
        
        List<String> isimler =  C10_İsimAlipListeMetodulustur.isimListesiOlustur();

        System.out.println("istenmeyen harfin oldugu isimler silindi\nkalan isimler : " 
                 + istenmeyenIsimleriSil(isimler));
        
    }
    public static List<String> istenmeyenIsimleriSil(List<String> isimler){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iceren isimleri silmek icin bir harf giriniz");
        String istenmeyenHarf = scan.next().substring(0,1);
        
        List<String> yeniListe= new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {
            if (!isimler.get(i).contains(istenmeyenHarf)){
                yeniListe.add(isimler.get(i));
            }
        }
        return yeniListe;
    }
}
