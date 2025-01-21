//Q. Write code to search the element in 2D array
package Linear_Search;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,43},
                {54,27,27,87,29},
                {35,67,191},
                {10,31,21}
        };
        int target=191;
        int [] ans= Search(arr,target);
        System.out.print(Arrays.toString(ans));
    }
    static int[] Search(int[][] arr,int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

