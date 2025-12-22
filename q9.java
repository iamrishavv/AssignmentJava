package Assignment;

import java.util.Scanner;

//Wap to read persons salary and age and check marriage eligibility.
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Enter your salary");
        int salary=sc.nextInt();
        if(salary>100000 && age <=30){
            System.out.println("you are eligible for marriage");
        }else {
            System.out.println("Not Eligible");
        }
    }
}
