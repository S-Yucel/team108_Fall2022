package day06_ifElseSatatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir karakter girmesini isteyin,
        girilen karakterin buyuk harf olup olmadigini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);
        if(girilenKarakter >= 'A' && girilenKarakter <= 'Z'){
            System.out.println("Girilen karakter büyük harf" );
        } else {
            System.out.println("Girilen karakter büyük harf değil");
        }
    }
}
