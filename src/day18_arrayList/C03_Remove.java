package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar); // [10, 5, 7, 9]
        
        //sayilar.remove(5);
        /*
        eger listemiz Integerlardan olusuyorsa 
        parametre olarak yazdıgımız sayının index mi yoksa obje mi oldugu
        belirsiz olmasın diye Java otomatik olarak girilen sayıyı index kabul eder
        
        eger Integerlardan olusan bir listede obje olarak bir elementi 
        silmek isterseniz önce onu tanımlamalısınız
        
         */
        
        Integer silinecekElement=5;
        System.out.println(sayilar.remove(silinecekElement)); // true
        
        silinecekElement=20;
        System.out.println(sayilar.remove(silinecekElement)); //false
        
        

    }
}
