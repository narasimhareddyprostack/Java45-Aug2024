package ArrayListEx;

import java.util.ArrayList;

public class ArrayListThree {
    public static void main(String[] args) {
        ArrayList emp_All=new ArrayList();//allowed heterogenous elements
        emp_All.add("101");
        emp_All.add("Banglaore");

        ArrayList<String> enames=new ArrayList<String>();//allowed only string objects
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");

        emp_All.addAll(enames);
        System.out.println(emp_All);
        //delete operation methods, remove(), removeAll(), and clear()
        emp_All.remove("Sonia");
        System.out.println(emp_All);
        emp_All.removeAll(enames);
        System.out.println(emp_All);
        //remove all elements from ArrayList-
        emp_All.clear();
        System.out.println(emp_All);


    }
}
