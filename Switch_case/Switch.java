package Switch_case;

import java.util.Scanner;

//Demonstrate switch case
public class Switch {
    public static void main(String[] args) {
        System.out.print("Enter a fruit name:");
        Scanner i=new Scanner(System.in);
        String ch=i.next();
        switch(ch) {
            case "Banana":
                System.out.println("A yellow fruit.");
                break;
            case "Apple":
                System.out.println("A red fruit.");
                break;
            case"Mango":
                System.out.println("King of fruits.");
                break;
            default:
                System.out.println("Try Again!!");
        }
    }
}
