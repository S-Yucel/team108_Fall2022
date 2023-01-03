package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("src/day28_exeptions/metin.txt");


        /*
        Bazı kodları yazdıgımızda Java compile time sırasında
        o kodlarda exception riskini gorur ve bizden bir cozum bekler

        ozellikle dosya okuma ve yazma ile ilgili IO (Input/Output) işlemlerinde
        ya okuyamazsam, ya yazamazsam diyerek
        bizden compile time da cozum ister

        bu durumda bir exceptionla karsılasıldıgında
        kod dursun diyorsak : method satırında throws keyword kullanarak beklenilen
                              exceptionları declare edebiliriz.
                              Bu sadece olayın farkında oldugumuzu deklare eder
                              exception fırlatmanın ve kodu durdurmanın onune gecmez
         kod calısmaya devam etsin : try-catch-(finally) blogu kullanabiliriz
         */


    }
}
