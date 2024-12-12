package CF.src.HashMapEx;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
    public static void main(String[] args) {
       Map<String,String> emp1=new HashMap<String,String>();
       Map<String,String> emp2=new Hashtable<String,String>();
        emp1.put("eid","101");
        emp1.put(null,"Rahul Gandhi");

        System.out.println(emp1);//{null=Rahul Gandhi, eid=101}
        System.out.println(emp2);//{}

        emp2.put("eid","101");
        emp2.put("ename","Rahul Gandhi");//{eid=101, ename=Rahul Gandhi}

        System.out.println(emp2);//
        //Note: null as key, not allowed in HashTable
    }
}
