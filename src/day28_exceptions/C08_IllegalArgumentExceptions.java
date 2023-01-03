package day28_exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentExceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasınızı girin");

        int yas = scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException("hata");
            }else{
                System.out.println("Yasınız kaydedildi");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }
}
