package day27_overriding;

public class FChild extends EParent{
    @Override
    protected void method1() {
        super.method1();
        /*
        eger overriding method ile birlikte overridden methodda çalışsın istersek
        overriding method içinde super
         */
    }
}
