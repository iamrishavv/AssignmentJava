package Assignment;

import java.util.Scanner;

//check year is leap year or not
public class q3 {
     static boolean isLeapYear(int year){
        if(year %4==0 && year%100!=0 || year%400==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year =sc.nextInt();
        if(isLeapYear(year)){
            System.out.println("Leap year");
        }else {
            System.out.println("Not Leap year");
        }
    }
}
