package day25_inheritance;

public class APersonel {
    protected String isim = "İsim atanmadı";
    protected String soyIsim = "Soyisim atanmadı";
    protected String telefon = "Telefon atanmadı";

    protected void maas(){
        System.out.println("Asgari ucret 1700 eurodur");
    }

    protected void ozelSigorta(){
        System.out.println("Tüm personelin ozel sigorta hakkı vardır");
    }

    private void privateMethod(){
        System.out.println("private metod");
    }
}
