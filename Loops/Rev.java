package Loops;

import java.util.Scanner;

//Q. Find the reverse of a number
public class Rev {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=x.nextInt();
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        System.out.println("The Reverse of the number: "+ans);
    }
}
