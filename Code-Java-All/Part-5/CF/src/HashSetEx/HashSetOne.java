package HashSetEx;

import java.util.HashSet;

public class HashSetOne {
    public static void main(String[] args) {
        HashSet hs1=new HashSet();//allowed heterogenous object
        HashSet<String> hs2=new HashSet<String>(); //allowed only String object
        HashSet<Integer> hs3=new HashSet<Integer>(100);
        HashSet<Float> hs4=new HashSet<Float>(100,0.9f);

        hs1.add(101);
        hs1.add("Rahul");
        hs1.add("Wayanad");
        hs1.add(101);
        hs1.add("Rahul");
        hs1.add("Wayanad");
        hs1.add(101);
        hs1.add("Rahul");
        hs1.add("Wayanad");
        hs1.add(45000.45);
        hs1.add("rahul@gmail.com");
        hs1.add(null);
        System.out.println(hs1);
    }
}
