package Basic;//Q. Check the case of the character which is entered by the user.
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        System.out.print("Enter a character:");
        Scanner x=new Scanner(System.in);
        char ch=x.next().trim().charAt(0);
        /*trim():This method remove all the whitespaces.
        charAt():This will return the character at the index given as parameter.
         */
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
