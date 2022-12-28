package day16_arrays;

import java.util.Arrays;
import java.util.Scanner;

import static day16_arrays.C10_ArrayeBirElementEkleme.arrayeElementEkleme;

public class C11_Odev {


        /*
        Kullanıcıdan yeni isimler alıp, var olan bir arraya ekleyen bir method olusturun
        kullanıcı yeni deger verdigi müddetce C10 daki methodu kullanarak eklemeye devam edin
        kullanıcı Q ya bastıgında arrayin son halini döndürün
         */
        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Lütfen bir isim giriniz");
                String eklenecekIsim = scan.nextLine();

                String[] isimler = {"Ali", "Veli", "Can" };


                isimler = arrayeElementEkleme(isimler, eklenecekIsim);
                System.out.println(Arrays.toString(isimler));

        }

        public static boolean isimEkle(String[] eklenilecekIsim, String eklenecekIsim) {
                String[] temp = new String[eklenilecekIsim.length + 1];


                boolean[] isimler = new boolean[0];
                if (eklenecekIsim.startsWith("Q") || eklenecekIsim.startsWith("q")) {

                        //System.out.println("İşlem sonlandı");
                        return false;
                        
                } else System.out.println(Arrays.toString(isimler));
                


                temp[temp.length - 1] = eklenecekIsim;


                return false;
        }
        


        }
        







