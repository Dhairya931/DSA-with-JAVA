//Q. perform linear search in a given range
package Linear_Search;
import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.print("Enter the length : ");
     int a= in.nextInt();
     int[] arr=new int[a];
     System.out.print("Enter the elements of array:");
     for(int i=0;i<arr.length;i++){
         arr[i]=in.nextInt();
     }
        System.out.print("Enter the starting of range:");
        int strt=in.nextInt();
        System.out.print("Enter the ending of range:");
        int end=in.nextInt();
        System.out.print("Enter the element want to search in range:");
        int b=in.nextInt();
        int ans=search( arr,strt,end,b);
        System.out.print(ans);
    }
    public static int search(int[] arr, int strt,int end,int b){
        if(arr.length==0){
            return -1;
        }
        for (int i=strt;i<=end;i++) {
            if (arr[i] == b) {
                return i;
            }
        }
        return -1;
    }
}
