//We use ArrayList when we want to add variable number of elements in an array, unlike in array we have to specify the size of the array previously.
//In other words we can say that the ArrayList is a resizable class of array.
/*Syntax
ArrayList<wrapper_class> var_name= new ArrayList<>()
 */
//Q. Store data in ArrayList and display them
package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        Scanner in=new Scanner(System.in);
        //to input the data
        for (int i=0;i<=5;i++){
            list.add(in.nextInt());
        }
        //to show the data
        //we can use for loop
        for(int i=0;i<=5;i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        //we can also simply print the data
        System.out.println(list);
    }
}
