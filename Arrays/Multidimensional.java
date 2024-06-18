//Multidimensional Array=> It is used to represent data in the form of matrices.It stores data in both row and column form.
/* For Example
      1  2  3
      4  5  6
      7  8  9
 */
//Multidimensional Array can also understand as array of arrays.
/*Syntax
1. data_type[][] var_name=new data_type[no.of rows][no.of columns]
2. data_type[][] var_name={{data},{data}}
 */
//Note=> Declaring of no.of columns is nor necessary but for rows it is compulsory.
//Q. Store the numbers in 2D array amd print them in multiple ways
package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Multidimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //First way to show the array (using for loop)
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        //Second way to show array (using for each loop)
        for(int[]a:arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
        //Third way to show array (using toString method)
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
