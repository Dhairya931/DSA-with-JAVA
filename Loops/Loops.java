package Loops;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        /*for loop: We use this loop when we know how many time loop will
        execute to perform the task.
         */
        for(int i=1;i<=10;i++){
            System.out.println(a+"X"+i+"="+a*i);
        }
        /*while loop:We use this loop when we are not sure how many times loop
        have to execute to perform the task.
         */
        int b=1;//Declaration
        while(b<=10){//Condition
            System.out.println(a+"X"+b+"="+a*b);
            b++;//Increment
        }
        /*do while loop:We use this loop when we have to perform the task at least
        one time.
         */
        do{
            System.out.println(a+"X"+b+"="+a*b);
            b++;//Increment
        }while(b<1);
    }
}
