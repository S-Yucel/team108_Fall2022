package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultipleCheckedExceptions {
    //metin.txt dosyasındaki yazıları yazdıralım

    /*
    Eger birden fazla catch cumlemiz varsa, ve exceptionlar arasında
    parent / child ilişkisi varsa
    1- ikisinide yazmak istiyorsak, once child exception, sonra parent yazdırılır.
    aksi takdirde parent ustte olursa, tum exceptionları yakalayacagından
    child exceptionu yazmak anlamsız olur
    2- İkisini yazmak istemezsek, sadece parent exception yeterli olacaktır
    cunku parent daha kapsayıcıdır ve daha cok exceptionu yakalar.

     */

    FileInputStream fis;

    {
        try {
            fis = new FileInputStream("src/day28_exceptions/metin.txt");
            int k = 0;
            while ((k= fis.read() )!= (-1)) {
                System.out.println((char)k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
