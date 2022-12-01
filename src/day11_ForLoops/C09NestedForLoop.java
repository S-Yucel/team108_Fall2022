package day11_ForLoops;

public class C09NestedForLoop {
    public static void main(String[] args) {
        // verilen input a gore çarpım tablosu oluşturun
        
        /*
        Java da iç içe yapılara nested denir
        burada
         */
        int input = 4;
        /*
        1  2  3  4
        2  4  6  8
        3  6  9  12
        4  8  12 16
         */

        for (int i = 1; i <=4 ; i++) { //outer loop ve i nin çarpılacagı 
            // sayıyı kontrol eder
            for (int j = 1; j <=4 ; j++) { // inner loop ve önceki ornekteki 
                // i degişkenini kontrol eder
                System.out.print(i*j + " ");
            }
            System.out.println(" ");
        }
        // outer loop un her bir deger artışı için
        // inner loop bastan calışır
        
        
    }
}
