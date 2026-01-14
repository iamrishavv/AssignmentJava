package Assignment;

public class q45 {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            String s=null;
            System.out.println(s.length());
        }
        //System.out.println("hi");
        catch(NullPointerException e){
            System.out.println(4);
            try {
                int i=23/0;
            }finally {
                System.out.println("in finally");
            }
            System.out.println(7);
        }
    }
}
