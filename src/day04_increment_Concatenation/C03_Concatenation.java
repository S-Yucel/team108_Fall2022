package day04_increment_Concatenation;

public class C03_Concatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String str1 ="";
        String str2 =" ";
        String str3 ="_";

        System.out.println(a+b);
        System.out.println(str1+a+b);

        System.out.println(a+str2+b);

        System.out.println(a+b+str3);

        System.out.println(str1+a*b);

        System.out.println(str2+(a+b));

        //System.out.println(str1-a); toplama dışında hiç bir işlem Stringle kullanılmaz


    }
}
