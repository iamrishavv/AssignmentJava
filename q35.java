package Assignment;

public class q35 {
    q35(){
        System.out.println("q35");
    }
    q35(int i){
        this();
        System.out.println("q35(int)");

    }
    public static void main(String[] args) {
        q35 r1=new q35(10);
        System.out.println("success");
    }
}
