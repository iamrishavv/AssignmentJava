package Assignment;

public class q22 {
    void test(){
        System.out.println("we are best friends");
    }
    public static void main(String[] args) {
        q22 q=new q22();
        System.out.println("i am main method");
        q.test();
    }
    static {
        System.out.println("i am sb");
    }
    {
        System.out.println(" i am ib");
    }
}
