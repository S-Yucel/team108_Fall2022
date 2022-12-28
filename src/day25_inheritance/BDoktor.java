package day25_inheritance;

public class BDoktor extends APersonel {
    /*
    Olusturdugumuz doktor clasında isim soyisim gibi , personel clasında olusturulan tum
    ozelliklerin bulunmasını istiyoruz
    bu durumda 2 tercihimiz var
    1- istenen tüm ozellikleri doktor clasında yeniden olusturabiliriz
    2- Doktor clasını personelin child ı yapabiliriz

    Doktor clasını, Personel clasının child ı yaptıgımızda, doktor clasından olusturulan objeler
    sadece kendi claslarındaki ozelliklere sahip olmaz
    aynı zamanda parent clası olan Personel deki ozelliklerede sahip olur.

    Bir child clastan obje olusturdugumuzda o objenin
    ozelliklerini belirlerken once kendi clasında varmı ona bakılır
    yoksa parent classa bakılır

    Bir class extends keyword ile başka bir clası kendine parent edinirse
    1-parent clastaki tum ozellikleri direk kullanabilir(isim,soyisim,telefon,maas gibi)
    2-isterse parent clastaki bir ozelligi kendisine uyarlayabilir(maas)
    3-isterse parent clasta olmayan yeni ozellikler ekleyebilir(nobet)
     */
    public static void main(String[] args) {
        BDoktor dok1 = new BDoktor();
        dok1.isim = "Kemal";
        dok1.soyIsim = "Bulut";

        System.out.println(dok1.isim+", "+dok1.soyIsim+", "+dok1.telefon);
        //Kemal, Bulut, Telefon atanmadı
        dok1.maas(); //doktor maasi 30*8*25 6000
        dok1.ozelSigorta(); //Tüm personelin ozel sigorta hakkı vardır
        dok1.nobet(); //Doktorlar haftada bir gun nobet tutar


    }

    @Override
    public void maas() {
        System.out.println("doktor maasi 30*8*25 " +6000);
    }
    public void nobet(){
        System.out.println("Doktorlar haftada bir gun nobet tutar");
    }
}
