package day27_overriding;

public class EParent extends DGrandParent{

    @Override
    protected void method1() {
        System.out.println("P method1");

        //@override notasyonu overriden method ile overriding methodu
        // ilişiklendirilir.
        //Eger overriden methodu bu ilişkiyi bozacak bir degişiklik yapılırsa
        //@overide CTE verir
    }
    protected  void method2(){
        System.out.println("P method2");
    }
}
