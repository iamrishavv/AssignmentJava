package Assignment;
//wap to read persons salary and calculate its salary.
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary=sc.nextInt();
        int pfSalary=(salary*12)/100;
        System.out.println(pfSalary);
    }
}
