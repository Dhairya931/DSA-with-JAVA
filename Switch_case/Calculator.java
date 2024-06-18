package Switch_case;//Q. Build a simple calculator code by using enhanced switch case.
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=x.nextInt();
        System.out.print("Enter second number: ");
        int b =x.nextInt();
        System.out.print("Enter an operator (X for exit): ");
        char ch=x.next().trim().charAt(0);
        int ans=a-b;
            switch (ch) {
                case '+' -> System.out.println("Addition of the number: " + a + b);
                case '*' -> System.out.println("Multiplication of the number: " + a * b);
                case '/' -> System.out.println("Division of the number: " + a / b);
                case '-' -> System.out.println("Subtraction of the number: " + ans);
                default -> System.out.println("Invalid operator");
            }
    }
}
