package day07_ternary_switchStatements;

public class C04_Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan değer 100 den büyükse sayıyı 2 ile çarpın
        100 eşit veya küçük ise sayıya 10 ekleyin
         */
        int input =45;
        // if else ile yaparsak
        if (input>100){
            input *= 2;
        } else {
            input +=10;
        }
        System.out.println("if else ile :" + input);

        input=45;
        input = input>100 ? input*2 : input+10;
        System.out.println("Ternary ile :" + input);

        /*
        Verilen input 100 den büyükse 5 e bölüp
         bölüm sonucunun tek sayı olup olmadığını kontrol edin
         eğer 100 den büyük değilse 10 ile bölümünden kalanı bulup
         bu kalanı 5 artırın...
         gibi işlemleri TERNARY ile YAPMAYIZ
         */
    }
}
