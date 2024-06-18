//Q. Print all 3 digit armstrong numbers
package Functions;
public class Armstrong {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            if(isArmstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int org=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum+=rem*rem*rem;
        }
        return org==sum;
    }
}
