package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı isteyin ve sayının karesini yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        double girilenSayi = scan.nextDouble();
        System.out.println("Girdiğiniz sayının karesi : " + girilenSayi * girilenSayi);
    }
}
