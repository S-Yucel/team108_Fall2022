package day14_doWhileLoop_scope;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir pozitif sayi isteyin,
        sayinin tam kare olup olmadigini bulun
        tam kare ise true degilse false yazdirin
        ornek: input : 16, output : 4
         */

        int input = 144;
        int kareKok =1;
        boolean sonuc = false;

        while (kareKok*kareKok<=input){
            if (kareKok*kareKok==input){
                System.out.println("Girilen sayinin karekoku : " + kareKok);
                sonuc = true;
                break;
            }else {
                kareKok++;
            }
        }
        System.out.println(sonuc);

        System.out.println("***************do-while-loop*******************");

        input= 144;
        kareKok= 1;
        sonuc= false;

        do{
            if (kareKok*kareKok==input){
                System.out.println("Girilen sayinin karekoku : " +kareKok);
                break;
            }else{
                kareKok++;
            }

        }while (kareKok*kareKok<input);
    }
}
