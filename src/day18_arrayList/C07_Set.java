package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_Set {
    public static void main(String[] args) {
        /*
        Javada bir cok yapida get ve set methodları bulunur
        get metodlar, b,lg,y, bize getirirken
        set metodlari bilgiyi update eder
         */
        List<String> yeniList = new ArrayList<>();
        
        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");

        System.out.println(yeniList); // [C, D, T]
        yeniList.add(2,"D");
        System.out.println(yeniList); //[C, D, D, T]
        //add metodu listede var olan listeden herhangi bir elementi silmeden 
        // istedigimiz elementi ekler kalanlari kaydirir
        
        yeniList.set(2,"M");
        System.out.println(yeniList); //[C, D, M, T]
        //set methodu varolanı siler yerine yenisini yazdirir
        
        
        
    }
}
