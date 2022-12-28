package day25_inheritance;

public class DToyota extends CCar{
    DToyota(){
        System.out.println("Parametresiz toyota constructoru calisti");
    }
    DToyota(String param1){
        System.out.println("Parametreli constructor calisti");
    }
    String marka = "Toyota";
    String uretimYeri = "Toyota farklı ulkelerde uretilir";



}
