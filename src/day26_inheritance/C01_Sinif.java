package day26_inheritance;

class Okul{
    String okulIsmi = "Yıldız kolleji";
    String telefon = "0123456789";


}

public class C01_Sinif extends Okul{
    String sinif = "11-C";
    String telefon = "0789456123";

    C01_Sinif(String telefon){
        System.out.println(telefon);
        System.out.println(this.telefon);
        System.out.println(super.telefon);

        System.out.println("************************");

        System.out.println(okulIsmi);
        System.out.println(this.okulIsmi);
        System.out.println(super.okulIsmi);

        System.out.println("************************");

        System.out.println(sinif);
        System.out.println(this.sinif);
    }

    public static void main(String[] args) {
        C01_Sinif obj = new C01_Sinif("04256789");
    }

}
