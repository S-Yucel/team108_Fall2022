package day08_StringManipulations;

public class C07_Substring {
    public static void main(String[] args) {
        String str = "Java öğren, işi kap"; // karakter sayısı 19
        System.out.println(str.length());
        
        // metnin tam ortasındaki karekteri bulmak

        System.out.println(str.charAt(str.length()/2)); //n
        
        // son karakteri yazdırmak
        System.out.println(str.charAt(str.length()-1)); //p
        
        // bir karekteri değilde verilen stringin içerdiği bir
        // metin parçasını elde etmek istersek
        

        System.out.println(str.substring(5,9)); //öğre
        // substring(başlangıç,bitiş) methodunda
        // başlangıç olarak yazılan index dahil(inclusive)
        //bitiş olarak yazılan index hariç(exculusive)dir.
        System.out.println(str.substring(5,10)); //öğren
        
        // str dan "Java" kelimesini yazdıralım

        System.out.println(str.substring(0,4)); //Java

        // str den kap yazdıralım
        System.out.println(str.substring(16, 19)); // kap
        System.out.println(str.substring(16)); //kap
        System.out.println(str.substring(str.length()-3)); // kap
        
        // substring kullanarak sadece J harfini yazdırın
        System.out.println(str.substring(0,1));

        // substring kullanarak 9. indexteki harfi güyük olarak yazdırn
        System.out.println(str.substring(9,10).toUpperCase()); // N
        System.out.println(str.toUpperCase().charAt(9)); //N
        System.out.println(str.toUpperCase().substring(9,10)); //N

        System.out.println(str.substring(3,3)); // boş satır yazdırır.
        System.out.println("*******");

        //System.out.println(str.substring(4,3)); 
        // StringIndexOutOfBoundsException hatası verir

        //System.out.println(str.substring(25,33));  StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length())); // hiçlik yazdırır
        System.out.println(str.substring(str.length()-1));
        //System.out.println(str.substring(str.length()+1));
        // StringIndexOutOfBoundsException hatası verir
        
        System.out.println("*******");
        
    } 
}
