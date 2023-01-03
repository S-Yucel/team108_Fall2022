package day28_exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {
        String str = "25a";

        // str a sayısal olarak 5 ekleyip yazdırın

        System.out.println(Integer.parseInt(str)+5);

        // eger str icinde sayı olmayan bir karakter olursa NumberFormatException

        Object sayiObj = str;
        Integer sayiInt = (Integer)sayiObj;

        System.out.println(sayiInt);
    }
}
