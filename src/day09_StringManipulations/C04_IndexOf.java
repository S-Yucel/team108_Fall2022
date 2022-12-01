package day09_StringManipulations;

import java.util.Scanner;

public class C04_IndexOf {
    public static void main(String[] args) {
        /*
        kullanıcıdan aldığımız cümle "çok" ile başlayan ilk kelimeyi yazdırın
        cümlede çok kelimesi geçmiyorsa "cümlede çok ile başlayan kelime yok"
        yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String girilenCumle = scan.nextLine();
        
        //sınavlarımızda çoktan seçmeli sorular kullanıyoruz
        // javayı çok seviyoruz
        // bu kadar çoklu seçenek olur mu?
        
        if (!girilenCumle.contains("çok")) {
            System.out.println("cümlede çok ile başlayan kelime yok");
        } else {
            int cokIndexi = girilenCumle.indexOf("çok");
            int boslukIndexi = girilenCumle.indexOf(" ",cokIndexi+1);
            System.out.println(girilenCumle.substring(cokIndexi, boslukIndexi));
        }
        
        
    }
}
