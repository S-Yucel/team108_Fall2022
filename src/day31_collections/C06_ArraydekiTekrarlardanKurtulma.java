package day31_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrarlardanKurtulma {
    /*
    verilen bir arraydeki tekrar eden elementleri sadece bir kere yazarak arrayi
    kısaltan kod yazın
     */

    public static void main(String[] args) {



    int[] arr = {1,2,4,5,6,2,3,5,6,2,4,5,1,2,4,3,2,5,5,6,1,2,3,4};
    Set<Integer> arrSet = new HashSet<>();
    //arraydeki tum elementleri Set e ekleyelim.

        for (int each:arr) {
            arrSet.add(each);
        }
        System.out.println(arrSet); //[1, 2, 3, 4, 5, 6]

        //Set deki element sayısına eşit array oluşturup
        //Setteki elementleri oraya taşıyalım

        arr = new int[arrSet.size()];
        int index = 0;
        for (int each:arrSet) {
            arr[index] = each;
            index++;
        }
        System.out.println("Arrayin son hali = " + Arrays.toString(arr));
        //Arrayin son hali = [1, 2, 3, 4, 5, 6]

    }

}
