package Functions;
import java.util.*;
//Q. Write a program to take the user input their name and greet them with their name
public class Greet {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter your name");
        String name= a.nextLine();
        String grt=gretting(name);
        System.out.println(grt);
    }
   static String gretting(String name){
        return "Hello "+name;
   }
}
