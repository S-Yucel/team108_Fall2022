package day08_StringManipulations;

public class C03_Equals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        
        String str3 = new String("Java");
        
        String str4 = "Ja";
        String str5 = str4.concat("va");
        System.out.println(str1==str2); //true

        System.out.println(str1==str3); //false

        System.out.println(str1==str5); //false
        
        /*
        == string için beklediğimiz sonuçları vermeyebilir
        çünkü double equal sign hem metnin değerini hem objenin referansını 
        karşılaştırır
        
        Javada String objelerinin metinlerinin aynı olup olmadığını
        kontrol etmek için == yerine = methodu kullanılmalıdır. 
        
         */

        System.out.println("*********************");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str5));
        
    }
}
