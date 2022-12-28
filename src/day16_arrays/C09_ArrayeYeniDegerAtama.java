package day16_arrays;

import java.util.Arrays;

public class C09_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};

        // arr1={3,6,1,8};
        //arr1={5,7,1};

        //arr1 = new int[];


        System.out.println(Arrays.toString(arr1));

        //13.cu satırdaki atama ile java arr1 in pointerını eski arraydan silip,
        //new keywordu ile oluşturdugumuz yeni arraya yönlendirir
        /*
        eski elementleri korumak istersek ne yapmalıyız?
        o zaman atama yapmadan önce yeni arrayı hazırlamalıyız
        bunun için boş bir yeni array oluşturup
        eski arraydeki elementleri yeni arraya taşıyıp sonra atamayı yapabiliriz
         */

        int[] temp = new int[5];

        for (int i = 0; i < arr1.length; i++) {

            temp[i] = arr1[i];

        }
        System.out.println(Arrays.toString(arr1)); // [1, 2, 3]
        System.out.println(Arrays.toString(temp)); // [1, 2, 3, 0, 0]

        arr1=temp;

        System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 0, 0]
        System.out.println(Arrays.toString(temp)); // [1, 2, 3, 0, 0]

    }
}
