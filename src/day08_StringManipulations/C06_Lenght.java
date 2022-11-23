package day08_StringManipulations;

import java.util.Random;

public class C06_Lenght {
    public static void main(String[] args) {
        String str = "Java her geçen gün daha da güzelleşiyor, değil mi?";
        System.out.println(str.charAt(str.length()-3)); //m
        System.out.println(str.length()); //50
        
        // Rastgele bir karekterini yazdıralım

        Random rnd = new Random(); // rnd değeri için 0 ile 1 arasında
        //rastgele bir değer oluşturur
        
        Random rnd1 = new Random();
        int index = rnd1.nextInt(str.length());
        System.out.println(str.charAt(index));
        
    }
}
