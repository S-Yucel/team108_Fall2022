package day03_dataCasting_Matematikselislemler;

public class C06_WrapperClass {
    public static void main(String[] args) {
        int sayi =10;
        String str ="Java candır";

        /*
        int primitive olduğu için hazır metodları yoktur
        non primitieve data türlerinin hazır metodları vardır

        int, char, boolean gibi primitieve data türlerinde hazır metod kullanmak için
        java Integer, Booleaan, Character gibi wrapper classlar oluşturmuştur.
         */

        Integer sayi2 = 20;
        /*
        İşlemlerimizi yaparken bazen String olarak tanımlanmış
        ancak matematiksel içerik barındıran variablelarla karşılaşabiliriz
        Bu durumda bu tür variableları sayıya çevirmek gerekebilir.

        Eğer sayıya çevirmek istediğimiz metinlerde harf veya sayı olmayan  başka karakter
        varsa Java hata verir.
         */
        String str2 = "123";
        String str3 = "354";
        System.out.println(str2 + str3);


        int str2int = Integer.parseInt(str2); // 123
        int str3int = Integer.parseInt(str3); //

        System.out.println(str2int + str3int); //477

        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

        char krk1 = '$';
        System.out.println(Character.isDigit(krk1)); // false
        System.out.println(Character.isLetter(krk1)); // false




    }
}
