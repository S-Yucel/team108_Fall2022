package day10_StringManipulations;

public class C01_NullPointer {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "    ";
        String str3;
        String str4 = null;

        System.out.println(str1.length()); //0
        System.out.println(str2.length()); //4

        System.out.println(str1.isEmpty()); //true
        System.out.println(str2.isEmpty()); //false
        System.out.println(str1.isBlank()); //true
        System.out.println(str2.isBlank()); //true
        
        // null bir değer değil işaretcidir(null pointer)
        // null pointer : non primitieve bir objeninoluşturulduğunu ancak 
        // bilinçli olarak değer atanmadığını işaretler
        
        // str4 un değeri null dır demek yanlıştır
        // str4 null olarak işaretlenmiştir demek doğrusudur

        //System.out.println(str3.length());
        //değer atanmadığı için hata verir

        //System.out.println(str3.concat("Ali can"));
        //değer atanmadığı için hata verir

        //System.out.println(str3.substring(3, 4));
        //değer atanmadığı için hata verir
        
        /*
        Java bir değer atamadan variable oluşturmaya izin verir
        ancak değer atanmadan kullanılmasına izin vermez
        bu sebepten değer atayıncaya kadar null olarak işaretleriz
        java bunun bilinçli yapıldığını bilir hata vermez.
        Ancak metodlarla kullanmak istersek NullPointerException hatası verir
         */
        str4=null;
        //System.out.println(str4.length()); // NullPointerException
        System.out.println(str4 + " Ali Can");
        //System.out.println(str4.concat("Ali Can")); //NullPointerException

    }
}
