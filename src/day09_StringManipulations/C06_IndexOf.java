package day09_StringManipulations;

public class C06_IndexOf {
    public static void main(String[] args) {
        String str = "Java ile kodlama çok kolay";
        
        // str çok içeriyormu dersek
        System.out.println(str.indexOf("v")); //2
        System.out.println(str.contains("çok")); //true
        
        //kullanıcıdan aldığımız cümle "çok" ile başlayan ilk kelimeyi yazdırın

        System.out.println(str.indexOf("çok")); //17

        System.out.println(str.indexOf("a", 5));
        
        /*
        2. o nun indexini yazdırın dersek
        önce ilk o yu buluruz sonra 2. o yu aratırız
         */
        int ilkIndex = str.indexOf("o"); //11
        int ikinciO = str.indexOf("o",ilkIndex+1);
        System.out.println(ilkIndex + " " + ikinciO);

    }
}
