package Assignment;

public class q16 {
    public static void main(String[] args) {
        int i=test();
        System.out.println(i);
    }
    static int test(){
        int i=10,j;
        return j=i++ + --i + ++i + ++i;
    }

}
