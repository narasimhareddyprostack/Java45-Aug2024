package LinkedListEx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class ALvsLLEx {
    public static void main(String[] args) {
       ArrayList<String> al_List=new ArrayList<String>();
        al_List.add("Rahul"); //index 0
        al_List.add("Sonia"); //index 1
        al_List.add("Priyanka");//index 2
        al_List.add("Modi"); //index 3
       LinkedList<String> ll_List=new LinkedList<String>();
        ll_List.add("Rahul"); //index 0
        ll_List.add("Sonia"); //index 1
        ll_List.add("Priyanka"); //index 2
        ll_List.add("Modi"); //index 3
        //insert "Rajnikanth" at index 2
        al_List.set(2,"Rajni");
        ll_List.set(2,"Rajni");
        System.out.println(al_List);
        System.out.println(ll_List);


    }
}
