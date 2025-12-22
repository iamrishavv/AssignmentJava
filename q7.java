package Assignment;
//wap to read shoes brand from the keyboard and print its slogan.
import java.util.Locale;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the brand name:");
        String s =sc.nextLine();
        String q=s.toUpperCase();
        switch (q){
            case "NIKE":
                System.out.println("Just Do It.");
                break;
            case "ADIDAS":
                System.out.println("Impossible is nothing.");
                break;
            case "PUMA":
                System.out.println("Forever Faster.");
                break;
            case "REEBOK":
                System.out.println("I am What I am.");
                break;
            default:
                System.out.println("Error Try Again");
        }
    }
}
