package day16_arrays;

import java.util.Arrays;

public class C10_ArrayeBirElementEkleme {
    public static void main(String[] args) {

        /*
        Verilen bir array istenen bir elementi ekleyip bize donduren bir method yazın
        eski arraye yeni degeri atayin
         */

        String[] isimler = {"Ali","Veli","Can"};

        String eklenecekIsim = "Kemal";

        isimler = arrayeElementEkleme(isimler,eklenecekIsim);
        System.out.println(Arrays.toString(isimler)); // [Ali, Veli, Can, Kemal]
    }

    public static String[] arrayeElementEkleme(String[] eklenilecekArray, String eklenecekElement){
        String[] temp = new String[eklenilecekArray.length+1];

        for (int i = 0; i < eklenilecekArray.length; i++) {
            temp[i] = eklenilecekArray[i];

        }

        temp[temp.length-1] = eklenecekElement;

        return temp;
    }
}
