package day25_inheritance;

public class ECorolla extends DToyota {
    ECorolla(){
        System.out.println("Parametresiz Corolla constructoru calisti");
    }
    ECorolla(String param1){
        super("Gri");
        System.out.println("String parametreli constructor");
    }
    String model = "Corolla";
    String uretimYeri = "Turkiye";

    public static void main(String[] args) {
        ECorolla cor1 = new ECorolla("mavi");
    }


    /*
    Bir obje olusturuldugunda ilk deger ataması yapılabilmesi icin constructor calismalidir
    Inheritancedan biliyoruzki child clasta olusturulan her
     obje parent clastaki ozelliklerede sahip olur
     parent clastaki ozelliklere sahip olabilmesi icin,
     parent clastaki constructorlarda calismalidir

     Java bu calismayi super() sayesinde saglar

     Javada her olusturulan classta gorunmesede default constructor oldugu gibi
     extends keyword kullanılan her clasta olusturulan her constructorun, ilk satırında gorunmesede,
     super() constructor call vardır

     */

}
