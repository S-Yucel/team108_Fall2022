package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan istedigi kadar sayi alin
        kullanici deger olarak 0 a basarsa islemi bitirin
         */
        int girilenSayi =1;
        int toplam = 0;

        Scanner scan = new Scanner(System.in);

        while (girilenSayi!=0){
            System.out.println("Lütfen toplamak icin bir tam sayi giriniz");
            girilenSayi = scan.nextInt();

            toplam += girilenSayi;
        }
        System.out.println("Girilen sayilarin toplami : " + toplam);
        /*
        While loop un 2 tane negatif yonu vardir.
        1-loop tan once olusturdugumuz ve loop da kullanacagimiz variablellara
        yanlis bir deger verirsek, loop body si hic calismayabilir
        2-loop conditionu(şartı) loop bodysinden bir kez daha fazla calisir
        Bu negatif yonler onu
        kullanilamazyapacak degildir. ancak bu negatifliklerden kurtulmak
        istersek do-while loop u kullanabiliriz
         */
    }
}
