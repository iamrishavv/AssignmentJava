package Assignment;

public class q24 {
    int i;
    static void test1(int x){
        x=10;
    }
    static void test2(q24 d1){
        d1.i=20;
    }

    public static void main(String[] args) {
        q24 d1=new q24();
        d1.i=30;
        System.out.println("A:"+d1.i);
        q24 d2=new q24();
        test1(d1.i);
        System.out.println("B:" +d1.i);
        test2(d1);
        System.out.println("C:"+d1.i);

    }
}
