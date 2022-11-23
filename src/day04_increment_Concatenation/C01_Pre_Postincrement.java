package day04_increment_Concatenation;

public class C01_Pre_Postincrement {
    public static void main(String[] args) {
        int sayi = 20;
        // sayi yı 3 artırın

        sayi = sayi + 3;
        System.out.println(sayi);

        sayi += 3;
        System.out.println(sayi);

        sayi++;
        sayi++;
        sayi++;
        System.out.println(sayi);

        sayi = sayi - 2;

        sayi -= 2;

        System.out.println(sayi);

        sayi = 10;
        // sayının değerini bir azaltın ve yazdırın
        sayi--;
        System.out.println(sayi);

        sayi = 10;
        //sayıyı önce yazdırın sonra azaltın
        System.out.println(sayi);
        sayi--;
        System.out.println(sayi);


    }
}
