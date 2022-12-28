package day21_staticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {
        int fiyat = 100;
        
        //%10, %20 ve %30 indirim uygulayıp indirimli 
        // fiyatı yazdıran 3 metot oluşturalım
        
        indirimYap10(fiyat);
        indirimYap20(fiyat);
        indirimYap30(fiyat);
        
    }
    public static void indirimYap10(int fiyat){
        
        fiyat = fiyat*90/100;
        System.out.println("%10 indirmli " + fiyat);
    }
    public static void indirimYap20(int fiyat){

        fiyat = fiyat*80/100;
        System.out.println("%20 indirmli " + fiyat);
    }
    public static void indirimYap30(int fiyat){

        fiyat = fiyat*70/100;
        System.out.println("%30 indirmli " + fiyat);
    }
}
