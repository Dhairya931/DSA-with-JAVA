//Q. Find the minimum number in array
package Linear_Search;
import java.util.Scanner;
public class Minimum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int a= in.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter the elements of array:");
        for(int i=0;i< arr.length;i++){
            arr[i]= in.nextInt();
        }
        int ans=min(arr);
        System.out.println("The minimum number in array is"+ans);
    }
    public static int min(int[] arr){
        int mi=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<mi){
                mi=arr[i];
            }
        }
        return mi;
    }
}
