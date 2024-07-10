//Q Search a character in the string.
package Linear_Search;
public class SearchInString {
    public static void main(String[] args) {
        String an="Elephant";
        char ch='p';
        boolean ans=search(an,ch);
        System.out.println(ans);
    }
    static boolean search(String an,char ch){
        for(int i=0;i<an.length();i++){
            if(ch==an.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
