package Loops;

import java.util.Scanner;
//Q. Show the nth Loops.Fibonacci number.
public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the value of which Loops.Fibonacci number will show: ");
        Scanner x=new Scanner(System.in);
        int n= x.nextInt();
        int a=0;
        int b=1;
        int cnt=2;
        while(cnt<=n){
            int temp=b;
            b=b+a;
            a=temp;
            cnt++;
        }
        System.out.println("The required number is: "+b);
    }
}
