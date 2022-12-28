package day16_arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {
        /*
        verilen bir Array i Naturel Order a gore sıralayıp yazdırın
         */
        String[] isimler = {"Huseyin","Yusuf","Mehmet","Akile","Said","ahmet","kemal","ahsen","akile"};
        System.out.println(Arrays.toString(isimler));

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        /*
        eger büyükten kücüge sıralamak istersek, önce sort kullanarak natural order a göre sıralar
        sonra ge.ici bir array kullanarak sıralamayı terse çeviririz
         */

    }
}
