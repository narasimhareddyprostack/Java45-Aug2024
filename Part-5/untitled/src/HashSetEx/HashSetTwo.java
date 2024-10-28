package HashSetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTwo {
    public static void main(String[] args) {
        HashSet hs1=new HashSet();//allowed heterogenous object

        hs1.add("Rahul");
        hs1.add("Wayanad");
        hs1.add(101);

        hs1.add(45000.45);
        hs1.add("rahul@gmail.com");
        hs1.add(null);

        System.out.println(hs1); //[null, Rahul, Wayanad, 101, 45000.45, rahul@gmail.com]
        //Iterate Hashset Object - using forEach
        for (Object obj:hs1) {
            System.out.println(obj);
        }
        //Iterate HashSet Object - using Iterator() method
        Iterator itr=hs1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

       /* for(int i=0;i<=hs1.size()-1;i++){
            //System.out.println("GM");
            System.out.println(hs1.g);
        }
        */
    }
}
