package day03_dataCasting_Matematikselislemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        /*
        Eğer geniş kapasiteli data türünden daha dar kapasiteli data türüne casting
        yapmak istersek, java bunu kabul etmez.Sorumluluk almamızı ister.
        bu sebepten işlemin gerçekleşmesi için cast yapmak istediğimiz değerin önüne
         parantez içinde dönüştürmek istediğimiz data türü yazılır.
         Buna da expiliciet narrowing denir
         */

        //double dbl =23.5;
        //int sayi = dbl;  Bu şekilde hata verir

        // böyle çalışır. Ondalık kısmını atar.
        double dbl =23.5;
        int sayi = (int)dbl;

        byte byt = (byte)sayi;
        System.out.println(sayi);
        System.out.println(byt);

        sayi=130;
        byt=(byte)sayi; //int daha kapsamlı olduğu için
        // müdahale etmemiz yani değerden önce parantez içinde data türünü yazmalıyız

        System.out.println("int 130 un byte hali : " + byt);//-126

        sayi=256;
        byt=(byte)sayi;
        System.out.println("int 256 nın byte hali : " + byt); //0

        sayi=13000;
        byt=(byte)sayi;
        System.out.println("int 13000 in byte hali : " + byt); //56
    }
}
