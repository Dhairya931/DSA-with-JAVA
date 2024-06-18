/*Syntax of multidimensional ArrayList
ArrayList<Arraylist<wrapper_class>> var_name=new ArrayList<>();
 */
//Q.demonstrate the multidimensional ArrayList
package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionalArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in =new Scanner(System.in);
        //Intialize
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        //Input the data
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
