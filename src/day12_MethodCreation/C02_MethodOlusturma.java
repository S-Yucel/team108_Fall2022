package day12_MethodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {
        //verilen 2 sayıyı şarpıp yazdıran bir method oluşturun
        
        //bir method ancak method call yapıldıgında çalışır
        //method call için method adı ve parametrelere uygun argumant yazılmalıdır
        //method call içerisinde yazılan variable veya değerlere argument denir
        // method call main içinde cagırılıyor.

        carpYazdir(5,8);
        carpYazdir(4,5.4);
    }
    
    public  static void carpYazdir(int sayi1,double sayi2){
        System.out.println(sayi1 * sayi2);
    }
    
}
