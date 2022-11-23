package day08_StringManipulations;

import java.util.Locale;

public class C02_toUppercaseLokal {
    public static void main(String[] args) {
        String str = "Java Candır";
        System.out.println(str.toLowerCase()); // java candir
        
        str = str.toLowerCase(Locale.GERMANY);
        System.out.println(str);
        str =str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
        
        str = "sevgi insanı hayata bağlar";
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.CANADA));
        str = str.toUpperCase(Locale.GERMAN);
        System.out.println(str);
        str = str.toLowerCase(Locale.forLanguageTag("tr"));
        System.out.println(str);
    }
}
