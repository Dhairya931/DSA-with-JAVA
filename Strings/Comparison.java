package Strings;
//Comparison of string
public class Comparison {
    public static void main(String[] args) {
        String a="Dhairya";
        String b="Dhairya";

// == method: it checks the value as well as the object reference variables pointing to.
        System.out.println(a==b);//gives true

        String c =new String("Dhairya");
        String d=new String("Dhairya");
        //Above is creating these values outside the pool but in the heap.
        //In this case == gives false
        System.out.println(c==d);//false

//.equals() method: It checks only the values.
        String n="Dhairya";
        String f="Dhairya";
        System.out.println(n.equals(f));//gives true

        String g =new String("Dhairya");
        String h =new String("Dhairya");
        System.out.println(g.equals(h));//gives true too

    }
}
