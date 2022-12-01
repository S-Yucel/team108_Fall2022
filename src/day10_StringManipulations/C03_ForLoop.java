package day10_StringManipulations;

public class C03_ForLoop {
    public static void main(String[] args) {
        // 1 ile 1000 arasındaki sayilari (sinirlar dahil) yanyana yazdirin
        // yazdirma işlemi bittiginde,
        //"Tum bu sayilarin toplami =  " deyip sayıların toplamını yazdır
        
        int sayilarToplami = 0;
        for (int i = 1; i <=1000 ; i++) {
            System.out.print(i+" ");
            //sayilarToplami = sayilarToplami+i; //bu sekilde profesyonel degil
            sayilarToplami += i; // boyle kullanilmali
            
            System.out.println(sayilarToplami);
        }
        //sadece sonucu görmek icin dongunundisinda yazdiralim
        System.out.println(" ");
        System.out.println("Tum bu sayilarin toplami =  " + sayilarToplami);
    }
}
