package Strings;

public class Performance {
    public static void main(String[] args) {
        String series="";
        for (int i=0;i<26;i++){
            char ch=(char)('z'-i);
            series +=ch;
        }
        System.out.println(series);

//The above example have time complexity O(n^2) because the string is internally running the loop and there is also the wastage of shape too.
//To solve above problem we us StringBuilder class
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<26;i++){
            char ch=(char)('z'-i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.deleteCharAt(2);
        System.out.println(builder);
    }
}
