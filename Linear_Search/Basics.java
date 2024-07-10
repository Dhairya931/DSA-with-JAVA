//Linear Search is a searching technique which iterate to each element of an array to search an element.
/* Time Complexity:
Worst case:O(n),means for searching element it has to iterate the whole array
Best case:O(1),means the element needed is pn 1st place of the array
 */
//Q.Search an element in array to demonstrate linear search
package Linear_Search;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the lenght of array:");
        int l=in.nextInt();
        int[] arr=new int[l];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the element you want to search:");
        int a=in.nextInt();
        search(arr,a);
    }
    static void search(int[] arr,int a){
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == a) {
                System.out.println("Element found at position:" + i);
            } else if (i== arr.length-1) {
                System.out.println("Element not found");
            }
        }
    }
}
