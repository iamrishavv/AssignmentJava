package Assignment;

import java.util.Scanner;

//check num is prime or not.
public class q2 {
    static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
