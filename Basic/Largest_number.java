package Basic;/*Q. Find the largest number from the three numbers
which are given by user
 */
import java.util.Scanner;
public class Largest_number {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=x.nextInt();
        System.out.print("Enter second number: ");
        int b=x.nextInt();
        System.out.print("Enter third number: ");
        int c=x.nextInt();
        //with if-else statements
        int max=a;
        if(max <b){
            max=b;
        }
        if(max<c){
            max=c;
        }
        System.out.println("Largest number by if-else statement: "+max);
        //without if-else statements
        int l=Math.max(c,Math.max(a,b));
        System.out.println("Largest number without conditional statements: "+l);
    }
}
