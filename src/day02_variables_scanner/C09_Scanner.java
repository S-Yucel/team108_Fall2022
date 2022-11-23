package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen bir tam sayı daha giriniz");
        int sayi2 = scan.nextInt();

        int temp;
        temp = sayi2;

        sayi2=sayi1;
        sayi1=temp;

        System.out.println("Sayıların yerini değiştirdim " + "\nSayı 1 in yeni değeri : " + sayi1
        + "\nSayı 2 nin yeni değeri : " + sayi2);

    }
}
