package day21_staticKeyword;

import java.util.Arrays;

public class C06_CokluElement {
    public static void main(String[] args) {
        int[] arr = {3,6,8};
        /*
        bir metot olusturun
        metotda arraye 5 elemntli yeni bir array atayın ve yazdırın
        main metota dondukten sonra yine arrayi yazdırın
         */
        arrayDegistir(arr);
        System.out.println(Arrays.toString(arr)); //[3, 6, 8]
    }
    public static void arrayDegistir(int[] b){
        b = new int[5];
        System.out.println(Arrays.toString(b)); //[0, 0, 0, 0, 0]
                 
    }
}
