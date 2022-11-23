package day02_variables_scanner;

public class C03_NonPrimitieveDataTypes {
    public static void main(String[] args) {
        String str = "Java candır";
        int sayi = 10;
        System.out.println(sayi);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        //Primitive data türlerinin hazır metodları yoktur.
        //non primitieve yani referans data tiplerinin hazır metodları vardır.

        str.charAt(1);
        System.out.println(str.isEmpty()); //false


    }
}
