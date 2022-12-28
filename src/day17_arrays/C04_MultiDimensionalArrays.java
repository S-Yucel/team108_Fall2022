package day17_arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int [][] arr = {{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        System.out.println(arr.length); //5
        System.out.println(arr[2].length); //4

        System.out.println(arr[2][1]); //7

        System.out.println(arr[3]); //[I@568db2f2

        //multidimensional array ile calisirken dikkat etmemiz gereken en onemli konu
        //yazdıgımız kodun bir arraymi yoksa yazdırabilecegimiz bir elementmi dondurdugudur

        System.out.println(Arrays.toString(arr[3])); // [2]

        //20. satırdaki 2 elemnti yazdırmak istersek
        System.out.println(arr[3][0]); // 2

        //MDA in tamamını yazdırmak istersek
        // tek katlı arrayları yazdırmak için kullandıgımız yontem yeterli olmaz
        System.out.println(Arrays.toString(arr));
        //[[I@378bf509, [I@5fd0d5ae, [I@2d98a335, [I@568db2f2, [I@16b98e56]
        //referansları yazdırır

        System.out.println(Arrays.deepToString(arr));
        //[[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]
    }
}
