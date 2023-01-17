package day31_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        /*
        Deque double ended queue demektir
        iki yönlu kuyruk. yani baştanda sondanda ekleme yapılabilir
        bu iki yonlu yapısından dolayı, bir cok methodun first() ve last() versiyonu vardır.
         */

        Deque<String> harfler = new LinkedList<>();
        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler); //[J, L]
        harfler.addFirst("B");
        System.out.println(harfler); //[B, J, L]

        System.out.println(harfler.removeFirst()); //B
        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");
        System.out.println(harfler); //[A, J, L, A, K]

        // sona dogru olan A yı sil
        System.out.println(harfler.removeLastOccurrence("A"));//true
        System.out.println(harfler.removeLastOccurrence("T"));//false

        LinkedList<String> karakterler = new LinkedList<>();
        karakterler.push("O");
        System.out.println(karakterler); //[O]
        karakterler.push("B");

        System.out.println(karakterler.clone());//[B, O]
        System.out.println(karakterler);
        //[B, O]
        //[B, O]

    }
}
