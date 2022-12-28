package day15_scope_arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,}; // tercih edilen budur
        //veya
        int arr2[] = {4,5,6,7,8,9};

        //arraylar yukaridaki gibi yazilirsa ,
        //kac element yazildiysa onu lenght olarak kabul eder.

        String[] harfler = new String[400];

        System.out.println(arr.length);
        System.out.println(arr2.length);
        System.out.println(harfler.length);

        /*
        Stringde kullandigimiz harfler.lenght bir method iken
        array deki lenght method degil variable dir
         */

    }
}
