package Loops;


import java.util.Scanner;

//Q. Find the occurrence of a number in a given integer value
public class Count {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.print("Enter an integer number");
        int a= x.nextInt();
        System.out.print("Enter the number you want to find");
        int b=x.nextInt();
        int cnt=0;
        while(a>0){
            int rem=a%10;
            if(rem==b){
                cnt++;
            }
            a/=10;
        }
        System.out.print("The number occurred "+cnt+" times.");
    }
}
