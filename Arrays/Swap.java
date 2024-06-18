//Q. Make a function which swap elements of two indices given by user
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int a=in.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter elements of the array: ");
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Array before swapping" );
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter indices for swap");
        System.out.print("First index: ");
        int x= in.nextInt();
        System.out.print("Second index: ");
        int y= in.nextInt();
        swap(arr,x,y);
        System.out.println("Array after swapping");
        System.out.print(Arrays.toString(arr));

    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
