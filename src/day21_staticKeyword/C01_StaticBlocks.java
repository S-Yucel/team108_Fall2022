package day21_staticKeyword;

public class C01_StaticBlocks {
    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main metot calisti");
    }
    static {
        //static bloklar classtaki tum yapilardan, Hatta mainden bile once calisir
        //static blockta istedigimiz bir variablea baslangic degerinin atanmasi,
        // kullanicidan yetki sorgulamasi gibi islemler yapilabilir.
        //main metot calismadan once yapilmasi gereken islemler icin kullanilir.
        //metotlarin ve static blocklarin sıralamasi Java acisindan onemli degildir
        //ancak birden fazla static metot varsa once ustteki calışir
        
        System.out.println("static block calisti");
    }
    static {
        System.out.println("Alttaki static block calisti");
    }
}
