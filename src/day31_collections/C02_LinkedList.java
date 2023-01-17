package day31_collections;

import java.util.ArrayList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        /*
        List data turunde bir linked list olusturalım
         */
        List<String> harfler = new ArrayList<>();
        harfler.add("H");
        harfler.add("K");
        System.out.println(harfler); //[H, K]

        harfler.add("H");
        System.out.println(harfler); //[H, K, H]

        // 1. indexe M ekle
        harfler.add(1,"M");
        System.out.println(harfler); //[H, M, K, H]

        // 1. indexe K yı L yapalım
        harfler.set(2,"L");
        System.out.println(harfler); //[H, M, L, H]

        List<String> karakterler= new ArrayList<>();
        karakterler.add("*");
        karakterler.add("#");
        karakterler.add("9");
        karakterler.add(2,"M");
        System.out.println(karakterler); // [*, #, M, 9]

        System.out.println(harfler.retainAll(karakterler)); //true

        System.out.println(harfler); // [M] ortak element dısındaki tum elemanlar silindi

        System.out.println(harfler.addAll(karakterler)); //true
        System.out.println(harfler); //[M, *, #, M, 9]
        System.out.println(harfler.removeAll(karakterler)); // true
        System.out.println(harfler); // []

        System.out.println(karakterler.subList(1, 3)); //[#, M]

        System.out.println(karakterler); //[*, #, M, 9]

        System.out.println(karakterler.hashCode()); //2210822

    }

}
