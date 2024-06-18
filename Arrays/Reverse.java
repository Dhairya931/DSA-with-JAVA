package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int a=in.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter elements of the array: ");
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Array before reverse: " );
        System.out.println(Arrays.toString(arr));
        System.out.print("Array after reverse: " );
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start =0;
        int end=arr.length-1;
        while(start<end){
            swap(arr, start,end);
            start++;
            end--;
        }
    }
    static void swap(int[]arr, int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
