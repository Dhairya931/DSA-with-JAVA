package Linear_Search;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
       int[] num={12,346,2,6,-7984};
        System.out.println(count(num));
    }
    public static int count(int[] num){
        int count=0;
        for(int i=0;i<=num.length-1;i++){
            if(even2(num[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int n){
        int cnt=0;
        if(n<0){
            n*=-1;
        }
        while(n>0){
            cnt++;
            n/=10;
        }
        if(cnt%2==0){
            return true;
        }
        return false;
    }
    //optimize way to check the ven digits
    public static boolean even2(int n){
        int cnt=0;
        if(n<0){
            n*=-1;
        }
        cnt=(int)(Math.log10(n))+1;
        if(cnt%2==0){
            return true;
        }
        return false;
    }
}
