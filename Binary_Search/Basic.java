//Binary Search:It is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
/*
Time Complexity:
Best case:O(1),means the target is at first
Worst case:O(log n),means we have to iterate in array for the search
 */
package Binary_Search;
public class Basic {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int n=12;
        System.out.println(binary(arr,n));
    }
    public static int binary(int[] arr,int n){
        int strt=0;
        int end=arr.length-1;
        while(strt<=end){
            //find the middle element
            //int mid=(strt+end)/2, might be possible that (strt+end) exceeds the range of integer in java
            int mid=strt+(end-strt)/2;
            if(n<arr[mid]){
                end=mid-1;
            }
            else if(n>arr[mid]){
                strt=mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
