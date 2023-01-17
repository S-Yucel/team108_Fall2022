package day31_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {
        Queue<String> harfler = new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler); //[H, K, B, K]

        // 1.indexe F ekleyin dersek
        //Queue ozelliginden dolayı ekleme sona olmalı, araya ekleme olmaz.

        System.out.println(harfler.remove()); //H
        System.out.println(harfler); //[K, B, K]
        System.out.println(harfler.remove("K")); //true
        System.out.println(harfler); //[B, K]

        System.out.println(harfler.poll()); // B
        System.out.println(harfler.element()); //K
        System.out.println(harfler); //[K]
        System.out.println(harfler.peek()); //K
        System.out.println(harfler); // [K]

        Queue<String> karakterler = new LinkedList<>();
        //System.out.println(karakterler.element()); //.NoSuchElementException
        System.out.println(karakterler.peek()); // null

        System.out.println(harfler.poll()); //K
        System.out.println(harfler);//[]

        System.out.println(harfler.offer("B")); //true
        System.out.println(harfler); //[B]
        /*
        add ile offer arasındaki fark;
        offer varsa kapasiteyi kontrol eder
        kapasite uygunsa ekler.
        add varsa kapasiteye bakmaz direk ekler
         */






    }
}
