package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String n ="abccba";
        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome(String str){
        str=str.toLowerCase();
        for (int i=0;i<=str.length()-1;i++){
            char strt=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(strt!=end)
                return false;
        }
        return true;
    }
}
