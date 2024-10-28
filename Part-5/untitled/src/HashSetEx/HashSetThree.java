package HashSetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetThree {
    public static void main(String[] args) {
        HashSet<Integer> s1=new HashSet<Integer>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        HashSet<Integer> s2=new HashSet<Integer>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        s2.add(6);
        //Set Operations
        //Union Operation
        //s1.addAll(s2);[1,2,3,4,5,6]
        //System.out.println(s1);

        //Intersection operator
        //s1.retainAll(s2);
        //System.out.println(s1);//[3,4]
        //only set 1 - elements
        //s1.removeAll(s2);
        //System.out.println(s1);
        //containsaall
        s1.containsAll(s2);
        System.out.println(s1);

    }
}
