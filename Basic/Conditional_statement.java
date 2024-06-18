package Basic;

import java.util.Scanner;
public class Conditional_statement {
    public static void main(String[] args) {
        // if we have to check something like salary is greater than 10000 or not
        /*
        if Syntax:
        if(condition){
        body (executes only when condition is true)
        }
        else{
        body (executes if condition is false)
        }
         */
        /*
        Q. Take the input of salary by user and check if it higher than 20000 give bonus of 3000,
        if it is more than 10000 give bonus of 2000 otherwise give bonus of 1000
        */
        Scanner i=new Scanner(System.in);
        System.out.print("Enter the salary:");
        int a =i.nextInt();
        if (a>20000){
            a+=3000;
        }else if(a>10000){
            a+=2000;
        }else{
            a+=1000;
        }
        System.out.println(a);
    }
}