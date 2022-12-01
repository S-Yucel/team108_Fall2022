package day09_StringManipulations;

public class C03_StartsWith {
    public static void main(String[] args) {
        String str = "Java mutluluktur";
        System.out.println(str.startsWith("Java")); //true
        System.out.println(str.startsWith("mutlu")); //false
        System.out.println(str.startsWith("J")); //true
        
    }
}
