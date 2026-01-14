package Assignment;

public class q34 {
    q34(){
        System.out.println("q34");
    }
    q34(int i){
        q34 q1=new q34();
        System.out.println("q34");
    }
    public static void main(String[] args) {
        q34 obj1=new q34();
        System.out.println("--------");
        q34 obj2=new q34(10);
        System.out.println("--------");
    }
}
