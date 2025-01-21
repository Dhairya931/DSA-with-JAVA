package Linear_Search;

import java.util.Arrays;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,43},
                {54,27,27,87,29},
                {35,67,191},
                {10,31,21,300}
        };
        System.out.println(Arrays.toString(max(arr)));
    }
    public static int [] max(int[][] arr){
        int ans=0;
        int place=0;
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>ans){
                ans=sum;
                place=i;
            }
        }
        return new int []{ans,place};
    }
}
