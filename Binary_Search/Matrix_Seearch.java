package Binary_Search;

/*
Q. Search the target element in n*n matrix
Ex:   10 20 30 40
      15 25 35 45
      28 29 37 49
      33 34 38 50
 */

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Seearch {
    public static void main(String[] args) {
        int num=0;
        Scanner in=new Scanner(System.in);
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,27,49},
                {33,34,38,50}
        };
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.print("Enter the number you want to search in the matrix:");
        num=in.nextInt();
        System.out.println(Arrays.toString(search(arr,num)));
    }
    static  int[] search(int[][] matrix,int n){
        int r=0;
        int c=matrix.length-1;
        while(r< matrix.length && c>=0){
            if(matrix[r][c]==n)
                return new int[]{r,c};
            else if(matrix[r][c]>n)
                c--;
            else if (matrix[r][c]<n)
                r++;
        }
        return new int[]{-1,-1};
    }
}
