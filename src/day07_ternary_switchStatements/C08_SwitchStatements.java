package day07_ternary_switchStatements;

public class C08_SwitchStatements {
    public static void main(String[] args) {
        /*
        kullanıcıdan 2 sayı alın ve kullanıcıya istediği işlemi sorun
        +,-,*,/ işaretlerinden hangisini girerse o işlemi yapın
        bu işaretlerden birini girmezse yanlış işlem yazdırın
         */

        int sayi1 = 20;
        int sayi2 = 10;

        char islem ='+';

        switch (islem) {
            case '+':
                System.out.println("Sayıların toplamı :" + (sayi1+sayi2));
                break;
            case '-':
                System.out.println("Sayıların farkı :" + (sayi1-sayi2));
                break;
            case '*':
                System.out.println("Sayıların çarpımı : " + sayi1*sayi2);
                break;
            case '/':
                System.out.println("Sayıların bölümü :" + sayi1/sayi2);
                break;
            default:
                System.out.println("Yanlış işlem");

            }




    }
}
