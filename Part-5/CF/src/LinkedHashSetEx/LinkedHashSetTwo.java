package CF.src.LinkedHashSetEx;

import java.util.*;

public class LinkedHashSetTwo {
    public static void main(String[] args) {

       LinkedHashSet<String> enames=new LinkedHashSet<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add(null);
        enames.add("Priyanka");
        enames.add("Rahul");
        enames.add("Modi");
        enames.add("Amith");
        System.out.println(enames);
        //Iterate LinkedHashSet
        for (String ename:enames) {
            System.out.println(ename);
        }
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
