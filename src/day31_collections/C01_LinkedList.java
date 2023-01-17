package day31_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        Collections objeleri bir arada tutan yapılardır.
        gercek hayattaki ihtiyaclara gore java farklı collection yapıları olusturmustur.
        bir uygulamada hangi collectionu kullanacagımıza istedigimiz ozelliklere gore
        karar veririz.
        collections temelde 3 ana gruba ayrılır ve 3 interface ile kuralları belirlenmistir.
        1-List
        2-Queue
        3-Set
        ancak interfacelerden obje olusturalamayacagı için , child claslarının constructorları kullanılır.
        Burada ozellikleri belirleyen constructor degil, DATA turu olarak secilen collectiondur.

        Ornegin Linked List olustururken sececegimiz data turu ile
        Queue, Dequeue, List veya tumunun ozelliklerini tasıyan LinkedListler olusturabiliriz.
         */

        LinkedList<String> ll1 = new LinkedList<>();
        List<String> ll2 = new LinkedList<>();
        Queue<String> ll3 = new LinkedList<>();
        Deque<String> ll4 = new LinkedList<>();

    }
}
