//Array is a data structure which used to store same type of data in a single variable.
/*Syntax
1. datatype[] variable =new datatype[size]
2. datatype[] variable={data_items}
*/
//Q take the roll no. from the user and store it in the array and show it by all the possible ways.
package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] rollno =new int[5];
        for (int i=0;i<rollno.length;i++){
            rollno[i]=in.nextInt();
        }
        //First way to show the array (using for loop)
        for(int i=0;i<rollno.length;i++){
            System.out.print(rollno[i]+ " ");
        }
        System.out.println(' ');
        //Second way to show array (using for each loop)
        for (int num:rollno){
            System.out.print(num+" ");
        }
        System.out.println(' ');
         //Third way to show array (using toString method)
        System.out.print(Arrays.toString(rollno));
    }
}
