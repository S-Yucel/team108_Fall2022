package day09_StringManipulations;

public class C04_EndsWith {
    public static void main(String[] args) {
        String str = "Java öğrenen işsiz kalmaz";
        System.out.println(str.endsWith("kalmaz")); //true
        System.out.println(str.endsWith("Java öğrenen işsiz kalmaz")); //true
        System.out.println(str.endsWith("")); //true
        System.out.println(str.endsWith("z")); //true
    }
}
