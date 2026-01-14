package Assignment;

public class q25 {
    int i;
    static q25 test(){
        q25 t1=new q25();
        return t1;
    }
    public static void main(String[] args) {
        q25 obj=test();
        System.out.println(obj.i);
    }
}
