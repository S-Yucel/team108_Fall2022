package day07_ternary_switchStatements;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
        input olarak verilen sayıyı control edip sayı çif ise çift sayı değilse tek sayı
         */
        int inputSayi = 5;
        System.out.println(inputSayi%2==0 ? "çift sayı" : "tek sayı");
    }
}
