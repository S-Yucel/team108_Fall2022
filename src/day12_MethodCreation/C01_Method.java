package day12_MethodCreation;

import day02_variables_scanner.C08_Scanner;

public class C01_Method {
    public static void main(String[] args) {
        
        String str = "Java' da yolu yarıladık";
        
        str.isEmpty();  //boolean sonuc dondu ama kullanılmadık
        //Methodun döndürdügü sonucu kullanmak istersek ya yazdırırız
        //yada donen sonucu ileride kullanmak uzere atama yaparız
        
        str.isBlank();
        
        // methodlar bazen çok basit işlemleri bazende komplex işlemleri yapabilir
        //biz o işlemleri nasıl yapabiliriz diye düşünmek yerine 
        // hazır method u kullanmayı tercih ederiz
        //bizden sonra kodu inceleyecek kişilerde hazır method isimlerinden 
        // ne yapmak istediğimizi anlayabilirler.Ayrıca kodu her yazdışımızda
        //yapabileceğimiz muhtemel hatalardan kurtulmuş oluruz.
        
        str.toUpperCase();
        String buyukHarfHali=str.toUpperCase();
        
        
       
    }
}
