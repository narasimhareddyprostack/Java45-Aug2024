package ArrayListEx;

import java.util.ArrayList;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();//allowed heterogenous elements
        ArrayList<String> enames=new ArrayList<String>();//allowed only string objects
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        System.out.println(enames);
        //print size of array list
        System.out.println(enames.size());
        //verify is empty list or not
        System.out.println(enames.isEmpty());
        //verify element/object prsents in the lsit or not?
        System.out.println(enames.contains("Rahul"));
    }
}
