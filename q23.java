package Assignment;

public class q23 {
    static q23 test(){
        return new q23();
    }
    public static void main(String[] args) {
        q23 q=new q23();
        q.test1();
    }
    void test1(){
        System.out.println("Success");
    }
}
