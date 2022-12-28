package day22_immutableClasses;

import java.util.Arrays;

public class C02_ImmutableClasses {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str.toUpperCase()); // JAVA
        str.toLowerCase();
        System.out.println(str); //Java

        /*
        String immutable oldugundan, metotlar kalıcı degisiklik yapmaz
         */

        int[] arr = {9,5,17}; //[5, 9, 17]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Array bir mutable class oldugu için
        //metot ile yaptıgımız degisiklik kalıcı olur
    }
}
