package day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_VerilenSayilardanFibonnaciMetodListeOlustur {
    public static void main(String[] args) {
        /*
        Verilen pozitif bir n tamsayisini alarak, bize ilk n tane 
        Fibonacci sayisini bir list olarak donduren bir method olusturun.
         */
        fibonacciOlustur();
        System.out.println();
        
    }
    
    public static List<Integer> fibonacciOlustur(){

        java.util.List<Integer> fibonacciList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kac tane fibonnacci istediginizi giriniz");
        int n = scan.nextInt();
        
        if (n<1){
            System.out.println("Gecersiz sayi");
            return null;
        } else if (n==1) {
            fibonacciList.add(0);
            return fibonacciList;
            
            
        } else if (n==2) {
            fibonacciList.add(0);
            fibonacciList.add(1);
            return fibonacciList;
            
        }else {
            int sayi1=0;
            int sayi2=1;
            int sayi3=1;
            
            fibonacciList.add(sayi1);
            fibonacciList.add(sayi2);
            //fibonacciList.add(sayi3); // do ile yaptıgımız icin kapattım
            
            do {
                fibonacciList.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
                sayi3=sayi1+sayi2;
            }while (fibonacciList.size()<=n-1);

            return fibonacciOlustur();
        }
        
    }
}
