package day27_overriding;

public class CAvciKuslar extends BKuslar {
    protected void hareket(){
        System.out.println("ucarlar");
    }
    protected void beslenme(){
        System.out.println("et yerler");
    }
    protected void pence(){
        System.out.println("Pencelidirler");
    }
    protected void gaga(){
        System.out.println("gagalıdırlar");
    }

    public static void main(String[] args) {
        CAvciKuslar kartal1 = new CAvciKuslar();

        kartal1.hareket();//c
        kartal1.beslenme();//c
        kartal1.pence();//c
        kartal1.gaga();//c
        kartal1.kanat();//b
        kartal1.solunum();//b
        kartal1.cogalma();//b
        kartal1.omur();//a

        /*
        eger construktor ile data türü aynı ise ozelligin variable
        yada method olmasına bakılmazsızın
        o classa gidilir. o class veya parent claslarda bulunan ilk deger alınır
         */

        BKuslar krt2 = new CAvciKuslar();
        krt2.hareket();//c
        krt2.beslenme();//c
        //krt2.pence();// BKuslar veya parent clasta yok, CTE verir
        krt2.gaga();//c
        krt2.kanat();//b
        krt2.solunum();//b
        krt2.cogalma();//b
        krt2.omur();//a

        AHayvanlar krt3 = new CAvciKuslar();
        krt3.hareket();//c
        krt3.beslenme();//c
        //krt3.pence();//
        //krt3.gaga();//
        //krt3.kanat();//
        krt3.solunum();//b
        krt3.cogalma();//b
        krt3.omur();//a


    }

}
