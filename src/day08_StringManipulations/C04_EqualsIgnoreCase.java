package day08_StringManipulations;

public class C04_EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Pazar";
        String str2 = "PAZAR";
        String str3 = "pazar";
        String str4 = "PaZaR";

        System.out.println(str1==str2); //false
        System.out.println(str1==str3); //false
        
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str4)); // false
        
        /*
        Eğer iki metni KARŞILAŞTIRIRKEN  
        büyük küçük harf duyarlılığı (case sensitieve) önemsiz ise o zaman
        equalsIgnorcase kullanılır.
         */
        System.out.println("********************");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
    }
}
