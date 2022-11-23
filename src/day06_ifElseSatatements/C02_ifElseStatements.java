package day06_ifElseSatatements;

import java.util.Scanner;

public class C02_ifElseStatements {
    public static void main(String[] args) {
       /*
        Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen ikizkenar
        ise “İkizkenar ucgen” yazdirin, degilse “İkizkenar degil” yazdirin.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if((kenar1==kenar2 && kenar1!=kenar3) ||
           (kenar2== kenar3 && kenar2!= kenar1) ||
                (kenar3==kenar1 && kenar3!=kenar2 )) {

            System.out.println("ikizkenar");
        } else {
            System.out.println("İkizkenar değil");
        }
    }
}
