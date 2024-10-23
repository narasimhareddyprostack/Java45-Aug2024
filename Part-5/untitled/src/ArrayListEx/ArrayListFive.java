package ArrayListEx;

import java.util.ArrayList;

public class ArrayListFive {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Amith");

        //Iterate ArrayList  - for loop
        for(int i=0;i<=enames.size()-1;i++){
            System.out.println(enames.get(i));
        }
        //Iterate using while loop
        int i=0;
        while(i<=enames.size()-1){

            System.out.println(enames.get(i));
            i++;
        }
        //Iterate using for Each
        for (String ename:enames) {
            System.out.println(ename);
        }
    }

}
