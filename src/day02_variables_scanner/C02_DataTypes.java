package day02_variables_scanner;

public class C02_DataTypes {
    public static void main(String[] args) {
        char karakter = 'w';
        char krk2 = '5';
        char krk3 = '$';
        //char krk4 = '  .'; char data turu sadece 1 karakter kabul eder.
        //char hafızada 16 bit yani 2 byte yer kaplar

        long sayi = 78945632136544L; // int sınırlarından büyük bir değeri long
        // olarak bilinçli kullndıgımızı belirtmek için yanına büyük veya küçük L harfi koyarız
        // çünkü java eşitliğin sağ tarafını int olarak alğılar.

        float sayi3 = 4.567f; // float. Java ondalıklı sayıları otomatik olarak double kabul eder.
        // Özellikle float kullanmak istiyorsak değer ataması yaparken yanına f veya F yazmalıyız.

        //Float virgülden sonra 6 veya 7 basamak ekler
        // double ise virgülden sonra 15 veya 16 basamak ekler.

    }
}
