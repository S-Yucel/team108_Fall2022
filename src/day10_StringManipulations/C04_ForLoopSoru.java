package day10_StringManipulations;

import java.util.Scanner;

public class C04_ForLoopSoru {
    public static void main(String[] args) {
        //kullanicidan baslangic ve bitis degerlerini alip,
        // bu sinirlar dahil olarak, bu sinirlar dahilinde 
        // 5 in kati olan sayilari yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int ilkSayi  = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi girirniz");
        int ikinciSayi = scan.nextInt();

        for (int i = 0; i <=ikinciSayi ; i++) {
            
        }

        for (int i = ilkSayi; i <ikinciSayi ; i++) {
            if (i%5==0){
                System.out.println(i +" ");
            }
        }
    }
}
