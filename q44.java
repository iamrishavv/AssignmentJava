package Assignment;

public class q44 {
    public static int test() {
        try {
            return 0;
        } finally {
            System.out.println("in finally");
        }
    }
    public static void main(String[] args) {
        System.out.println(q44.test());
    }
}
