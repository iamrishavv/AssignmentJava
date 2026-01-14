package Assignment;

public class q41 {
    public static void main(String[] args) {
        try{
            System.out.println(1);
            String s=null;
            System.out.println(s);
            System.out.println(s.length());
            System.out.println(2);
        }catch (NullPointerException e){
            System.out.println(4);
            //System.out.println(s);
            System.out.println(5);
        }
        System.out.println(6);
    }
}
