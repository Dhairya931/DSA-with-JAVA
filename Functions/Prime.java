//Q. Check the number is whether prime or not.
package Functions;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int a=i.nextInt();
        boolean x=isprime(a);
        System.out.println(x);
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;

    }
}
