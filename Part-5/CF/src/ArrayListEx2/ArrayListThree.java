package ArrayListEx2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListThree {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        enames.add("Amith");
        enames.add("DK Shiva");
        // sort arraylist object
        //how to sort - using utility class ie Arrays,Collections
        System.out.println(enames);
        Collections.sort(enames, Collections.reverseOrder());
        System.out.println(enames);

    }
}
