package ArrayListEx2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        enames.add("Amith");
        enames.add("DK Shiva");
        //Iterate ArrayList - using for, while and dowhile and forEach, Iterator
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
