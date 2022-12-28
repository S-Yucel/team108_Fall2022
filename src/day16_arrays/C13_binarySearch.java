package day16_arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {
        /*
        binary tree javanın kullandığı özel bir sıralama yöntemidir

        binary search methodu binaryTree özelligini kullandıgından
        sıralı olmayan arrayler kullanıldıgında dogru sonuc dondurmeyebilir
        eger binarySearch kullanıcaksak öncesinde MuTLAKA sort() kullanılmalıdır
         */
        int[] arr = {2,6,9,3,15,1,7};
        System.out.println(Arrays.binarySearch(arr, 2));


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 6, 7, 9, 15]

        System.out.println(Arrays.binarySearch(arr, 2));
    }
}
