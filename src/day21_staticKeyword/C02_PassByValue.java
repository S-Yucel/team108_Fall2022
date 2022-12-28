package day21_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {
        
        /*
       Java PassByValue kullanir
        Yannni method'lar arasinda gonderilen variable'larin
        kendileri degil, value'lari diger method'a yollanir.
         */
        
        int fiyat =100;
        
        // fiyat uzerinden %10 indirim yapıp.
        // indirimli fiyatı yazdıran bir metot olusturun
        System.out.println(indirimYap10(fiyat)); //90
        
        System.out.println(fiyat); //100
        /*
        eger indirimli fiyatı kalıcı olarak fiyatımıza etki etmesini istersek
        atama yaparız.  yani derizki
        fiyat = indirimYap10(fiyat);
         */
        
    }
    public static int indirimYap10(int fiyat){
        fiyat=fiyat*90/100;
        
        return fiyat;
    }
}
