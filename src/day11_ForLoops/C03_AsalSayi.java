package day11_ForLoops;

public class C03_AsalSayi {
    public static void main(String[] args) {
        // input olarak verilen bir tam sayının asal sayı
        //olup olmadığını yazdırın
        // kendisinden başka sayıya tam bolünmeyen sayılara asal sayı denir
        
        int input = 4737;
        String sonuc = "Sayi asal";
        for (int i = 2; i < input-1 ; i++) {
            if (input%i==0){
                sonuc="Sayı asal değil";
                break;
                //bir loopun içerisinde "break" gorurse o loop u bitirir
            }
           
        }
        System.out.println(sonuc);
    }
}
