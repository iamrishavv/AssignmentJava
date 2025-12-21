package Assignment;

import java.util.Scanner;

// develop a program to print designation on the basis of their experience.
//0-2 Associate engineer
//2-4 software  engineer
//4-6 sr . software  engineer\
//6-8 Manager
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your exp: ");
        int exp=sc.nextInt();
        if(exp>=0 && exp<=2){
            System.out.println("Associate engineer");
        }else if(exp>2 && exp<=4){
            System.out.println("Software engineer");
        }else if(exp>4 && exp<=6){
            System.out.println("Sr. Software engineer");
        }else{
            System.out.println("Manager");
        }
    }
}
