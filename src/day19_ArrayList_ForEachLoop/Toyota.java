package day19_ArrayList_ForEachLoop;

public class Toyota {
    String marka = "Toyota";
    String model = "Model belirtilmemis";
    int yil;
    int km;
    String renk;
    
    //default constructor suna benzer
    public Toyota(){
        System.out.println("Toyota class ındaki constructor calisti");
    }

    public Toyota(String marka) {
        this.marka = marka;
    }
/*
    Constructorun iki temel ozelligi vardır. constructor olup olmadıgını anlamak icin bu iki 
    ozellige bakariz
    1-Constructor isimleri class ismi ile aynı olur ve buyuk harfle baslar
    2-Constrocturların return type ı olmaz
    
     */
    
    /*
    Javada her class obje uretmek uzere olusturulur,
    bir obje olusturulup, ilk deger atamasi icinde MUTLAKA 
    constructor calismalidir
    
    Javada her classta mutlaka bir constructor bulunur
    
    Her classta bizim constructor olusturmamiza gerek kalmamasi
    icin Java her classa default constructor koyar
    
    default constructor gorunmez, 
    default constructor parametresi olmayan 
    ve bodysinde hic kod bulunmaya bir constructordur
    
    Bir classda gozlerimizle bir Constructor gormuyorsak 
    o classta default constructor vardir
    
    eger kullanicilar tarafindan gozle gorulur bir constructor olusturulursa
    Java default constructoru siler
    
    
     */
}
