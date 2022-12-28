package day16_arrays;

import java.util.Arrays;

public class C04_ArrayIcindeHarfSilipNullYazma {
    public static void main(String[] args) {
        /*
        verilen bir String arrayda
        istenen bir harfi iceren kelimelleri silip, yerine null yazdirin
         */

        String[] isimler = {"Huseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarf = "u";

        for (int i = 0; i < isimler.length; i++) {
            if(isimler[i].contains(silinecekHarf)){
                isimler[i]=null;
            }

        }
        System.out.println(Arrays.toString(isimler));
    }
}
