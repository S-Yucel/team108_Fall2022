package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan ismini alın ve girilen ismi büyük harflerle yazdırın.
        //Kullanıcıdan değer almak için 3 işlem yapmak gereker.
        // 1 adım Scanner objesi oluşturmak

        Scanner scan = new Scanner(System.in);

        //2. adım kullanıcıya ne istediğimizi söylemek

        System.out.println("İsminizi yazın");

        // 3. adım kullanıcının gireceği değer kaydedeceğimiz bir variable oluşturmak.
        // scan objesi ile ilğili metodu kullanarak,
        // kullanıcının girdiği değeri oluşturduğunuz variable atarız

        String girilenIsim = scan.nextLine();

        // Artık kullanıcının girdiği değer girilenIsim variablenda kayıtlı

        System.out.println(girilenIsim.toUpperCase());
    }
}
