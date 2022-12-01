package day09_StringManipulations;

public class C07_IlkTest {
    public static void main(String[] args) {
        // gittiğimiz websayfasından aldığımız String arama sonuçlarında
        //arama sayısının 50 den fazla olduğunu test edin
        
        String input = "1-48 of 87 results for \"nutella \"";
        
        int indexOf = input.indexOf("of");
        int indexResults = input.indexOf("results");
        
        String sonucSayisiString = input.substring(indexOf+3,indexResults-1);
        //System.out.println(sonucSayisiString);
        
        int sonucSayisiInt = Integer.parseInt(sonucSayisiString);
        
        if (sonucSayisiInt>50) {
            System.out.println("Nutella arama sonucu testi PASSED");
        } else {
            System.out.println("İstenen kadar sonuç yok. Nutella arama testi FAİLLED");
        }
        
        
        
    }
}
