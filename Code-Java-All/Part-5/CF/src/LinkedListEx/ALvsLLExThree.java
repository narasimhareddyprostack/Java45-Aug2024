package LinkedListEx;

import java.util.ArrayList;
import java.util.LinkedList;

public class ALvsLLExThree {
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
        System.out.println(al_List);
        System.out.println(ll_List);

        al_List.remove(0);
        ll_List.removeFirst();

        al_List.remove(al_List.size()-1);
        ll_List.removeLast();

        System.out.println(al_List);
        System.out.println(ll_List);

    }
}
