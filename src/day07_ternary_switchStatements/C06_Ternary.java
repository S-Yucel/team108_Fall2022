package day07_ternary_switchStatements;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
         50’den kucukse “Maalesef kaldin” yazdirin.
         */
        int input = 54;
        System.out.println(input>50 ? "Sınıfı geçtin" : "Maalesef kaldın");

        /*
        Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        yoksa girilen harfi yazdirin
         */
        char karakter ='a';
        System.out.println(karakter>='a' && karakter<='z' ? (char) (karakter-32) : karakter );

        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin.
        input =-5;
        System.out.println(input>0 ? input : (-1)*input);
    }
}
