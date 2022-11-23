package day08_StringManipulations;

public class C05_CharAt {
    public static void main(String[] args) {
        String str ="Java güzeldir"; //13 karakter barındırır
        
        //javada index 0 dan başlar
        //J==> 0.index, r==>12
        //charAt(index) ile istediğimiz indexteki char a ulaşabiliriz

        System.out.println(str.charAt(1));
        
        //sondan 2. harf
        System.out.println(str.charAt(13-2));
        
        //sondan 4. harf
        System.out.println(str.charAt(13-4));
        
        //charAt metodu bize char döndürdüğü için toUpperCase çalışmaz
        //String metodlarını charAt ile kullanmak istersek
        //charAt tan önce kullanmalıyız

        System.out.println(str.toUpperCase().charAt(13-4));
        
        // System.out.println(str.charAt(18));
        //  StringIndexOutOfBoundsException hatası verir
        /*
        Eğer index olarak karakter sayısı
         */
    }
}
