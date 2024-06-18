//Q. Find the maximum item in the array.
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int a=in.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter elements of the array: ");
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Array: " );
        System.out.println(Arrays.toString(arr));
        System.out.print("Maximum item of the array: ");
        System.out.print(max(arr));
    }
    static int max(int[] arr){
        int mx=arr[0];
        for(int i=0;i<arr.length;i++){
            if(mx<arr[i]){
                mx=arr[i];
            }
            else{
                continue;
            }
        }
        return mx;
    }
}
