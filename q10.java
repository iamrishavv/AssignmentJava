package Assignment;

import java.util.Scanner;

//Pyramid pattern
//right and left triangle star pattern
//descending order pattern
public class q10 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
      //  int m=sc.nextInt();
        //pyramid
        for(int i=1;i<=5;i++){
            for(int j=i;j< 5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
