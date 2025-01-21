package Linear_Search;

public class Max2D {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,43},
                {54,27,27,87,29},
                {35,67,191},
                {10,31,21}
        };
        int ans=max(arr);
        System.out.print(ans);
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
