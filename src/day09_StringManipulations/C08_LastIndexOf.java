package day09_StringManipulations;

public class C08_LastIndexOf {
    public static void main(String[] args) {
        String str ="Javayı iyi öğrenmek için çok çalışmak lazım çok";
        System.out.println(str.indexOf("a")); //1
        System.out.println(str.lastIndexOf("a")); //39

        System.out.println(str.lastIndexOf("a", 15));
        //15. indexten geriye gider ilk gördüğü a yı yazdırır

        // verilen str da çok kelimesinin kullanımını kontrol edip
        // çok kelimesi kullanılmamış
        // bir kere kullanılmış
        // birden fazla kullanılmış
        // sonuçlarından uygun olanı yazdıralım
        // "Javayı iyi öğrenmek için çok çalışmak lazım çok"
        
        int ilkCokIndexi = str.indexOf("çok");
        int sonCokIndexi = str.lastIndexOf("çok");
        
        if (!str.contains("çok")) {
            System.out.println("çok kelimesi kullanılmamış");
        } else if (ilkCokIndexi==sonCokIndexi) {
            System.out.println("çok kelimesi birkere kullanılmış");
            
        } else {
            System.out.println("çok kelimesi birden fazla kullanılmış");
        }
    }
}
