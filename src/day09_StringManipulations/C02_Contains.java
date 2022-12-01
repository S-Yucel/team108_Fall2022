package day09_StringManipulations;

public class C02_Contains {
    public static void main(String[] args) {
        String str = "Java öğren mutlu ol";
        // str mutlu içeriyormu?
        System.out.println(str.contains("mutlu")); //true

        // charSequense : char dizisi (charların oluşturduğu string gibi düşünebiliriz)


        System.out.println(str.contains("j")); // false java case sensetive olduğu için
        System.out.println(str.contains("J")); //true
        System.out.println(str.contains(" ")); //true
        
        /*
        contains metodu kaç tane olduğuna değil,
        sadece olup olmadığına bakar
         */

        System.out.println(str.contains("Java") && str.contains("mutlu")); // true
        

        //System.out.println(str.contains(''));
        //aradığımız metnin String olması şart değil ancak char kabul etmez
        
        }
    }

