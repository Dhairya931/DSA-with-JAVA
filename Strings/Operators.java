package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//it adds the integer value of each character and return the result in integer
        System.out.println("a"+"b");//it concatenate both the strings
        System.out.println((char)('a'+2));//it add the integer value of character and number given and give the resultant character

        System.out.println("a"+1);
        //integer value will be converted to Integer that will call toString().
        //this will be same as "a"+"1" after few steps and concatenate them both.

        System.out.println("Dhairya"+ new ArrayList<>());

        //System.out.println(new Integer(56)+new ArrayList<>()) gives error because + operator works on primitive or when on thing in the expression is String
        String a=(new Integer(56)+""+new ArrayList<>());
        System.out.println(a);
    }
}
