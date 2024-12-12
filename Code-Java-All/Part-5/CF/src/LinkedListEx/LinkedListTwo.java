package LinkedListEx;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTwo {
    public static void main(String[] args) {
       LinkedList<String> enames=new LinkedList<String>(); //allowed only String Object/generic type
       LinkedList data=new LinkedList();//allowed hetrogenous
        enames.add("Rahul"); //0
        enames.add("Sonia"); //1
        enames.add("Priyanka");//2
        enames.add("Modi");  //3
        enames.add("Amith");  //4
        System.out.println(enames);
        //Iterating using - for,while,dowhile and forEach and Iterators
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
