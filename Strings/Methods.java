package Strings;

import java.util.Arrays;

//Strings have many methods to perform some of them listed below.
public class Methods {
    public static void main(String[] args) {
        String n="Dhairya Maheshwari";
        System.out.println(Arrays.toString(n.toCharArray()));
        System.out.println(n.toLowerCase());
        System.out.println(n.toUpperCase());
        System.out.println(n);
        System.out.println("Dhairya".strip());
        System.out.println(n.indexOf('r'));
        System.out.println(Arrays.toString(n.split(" ")));
    }
}
