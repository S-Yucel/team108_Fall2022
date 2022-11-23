package day07_ternary_switchStatements;

public class C05_Ternary {
    public static void main(String[] args) {
        /*
        Ternary işleminin sonucunu yazdıracaksak
        boolean şartın true veya false olması durumunda
        yazdıracağımız data lar farklı data türünde olabilir.
        Ancak atama yapacaksak true veya false olması durumunda alacağı değerler
        atayacağımız variable ın data türüne uygun olmalıdır
         */

        int sayi = 2;
        System.out.println(sayi>10 ? "büyük sayı" : sayi+2);

        //int b = sayi>10 ? "büyük sayı" : sayi+2;
        // atama yapacaksak oluşturduğumuz data türüyle aynı olmalıdır.

        //String b = sayi>10 ? "büyük sayı" : sayi+2;
    }
}
