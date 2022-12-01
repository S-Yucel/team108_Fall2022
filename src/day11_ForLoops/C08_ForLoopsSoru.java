package day11_ForLoops;

import java.util.Scanner;

public class C08_ForLoopsSoru {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir String isteyin ve String i tersine çevirip kaydedin
         */
        String str = "Java ogrenmek icin cok calismak lazim";
        
        String terstenStr="";
        
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            terstenStr+=str.substring(i,i+1);
        }
        System.out.println("Girilen cümlenin tersten yazılışı : " + terstenStr);
    }
}
