package day18_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_TekrarEdenElementleriSilmek {
    public static void main(String[] args) {
        int[] arr = {4,3,6,5,7,3,6,7,3,5,4,6,4,7,7,7};

        List<Integer> benzersizElementlerList = new ArrayList<>();
        
        // arraydeki tum elementleri alıp listede varmı diye kontrol edelim
        // ve olmayanları ekleyelim

        for (int i = 0; i < arr.length ; i++) {
            if (!benzersizElementlerList.contains(arr[i])){
                benzersizElementlerList.add(arr[i]);
            }
        }
        System.out.println(benzersizElementlerList); //[4, 3, 6, 5, 7]
        arr= new int[benzersizElementlerList.size()]; //[0,0,0,0,0]

        for (int i = 0; i < arr.length; i++) {
            arr[i] =benzersizElementlerList.get(i);
        }
        System.out.println("Array in son hali : " + Arrays.toString(arr)); //[4, 3, 6, 5, 7]
    }
}
