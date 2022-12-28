package day21_staticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {
        
        int s =20;
        
        
        System.out.println(s); //20
        
        //int s =30;
        //bir scope ta tanımlanan varible ı yeniden tanımlama ihtimali yoktur
        
        //String sayi = "Hasan";
        //data türüde degistirilemez
        //cunki javanın kavası karısır
        metot1();
        
    }
    
    public static void metot1(){
        metot2(5);
        String s = "Hasan";
        System.out.println(s);
    }
    public static void metot2(int s){
         s = s*s;
        System.out.println(s);
    }
}
