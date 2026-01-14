package Assignment;

public class q43 {
    static int test(){
        try {

        }catch (NumberFormatException e){
            return 20;
        }finally{

        }
        return 40;
    }
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(test());
        System.out.println(2);
    }
}
