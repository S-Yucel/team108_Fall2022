package day11_ForLoops;

public interface C13_FactoriyelYazdir {
    public static void main(String[] args) {
        // 5 in faktoriyelini hesaplayın
        int input = 5;
        int carpim = 1;
        for (int i = input; i >=1 ; i--) {
            carpim*=i;
        }
        faktoriyelyazdir(5);
        faktoriyelyazdir(3);
        faktoriyelyazdir(7);
    }

    static void faktoriyelyazdir(int i) {
        int input =5;
        int carpim =1;
        for (int j = 1; j <= i; j++) {
            carpim*=j;
            
        }
        System.out.println(i + "! =" + carpim);
    }
}
