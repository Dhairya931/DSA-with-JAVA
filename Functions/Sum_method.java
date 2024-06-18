package Functions;
//Q. Take two numbers from user and display sum of them.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Sum_method {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter first number :");
        int a= in.nextInt();
        System.out.print("Enter second number :");
        int b= in.nextInt();
        int ans=sum(a,b);
        System.out.println("Sum of the numbers is"+ans);
    }
    static int sum(int a,int b ){
        return a+b;
    }
}
