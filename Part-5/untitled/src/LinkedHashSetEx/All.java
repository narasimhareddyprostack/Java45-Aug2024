package untitled.src.LinkedHashSetEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class All {
    public static void main(String[] args) {
       ArrayList<String> enames1=new ArrayList<String>();
       LinkedList<String> enames2=new LinkedList<String>();
       HashSet<String> enames3=new HashSet<String>();
       LinkedHashSet<String> enames4=new LinkedHashSet<String>();
        enames4.add("Rahul");
        enames4.add("Sonia");
        enames4.add(null);
        enames4.add("Priyanka");
        enames4.add("Rahul");
        enames4.add("Modi");
        enames4.add("Amith");
        System.out.println(enames4);
        System.out.println(enames4.size());
        System.out.println(enames4.isEmpty());
        System.out.println(enames4.contains("Rahul"));
    }
}
