package CF.src.HashMapEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapFour {
    public static void main(String[] args) {
      HashMap<String,String>  product=new HashMap<String,String>();
      System.out.println(product);//{}
      product.put("p_Id","p101");
      product.put("p_Name","Marker Pen");
      product.put("price","30");
      product.put("discount","false");
      System.out.println(product);//{p_Name=Marker Pen, price=30, discount=false, p_Id=p101}
        //print all key:values pairs - using keySet();
        //print all values using - values();
        //print all key:values - using entrySet();
        Set<Map.Entry<String,String>> entries=product.entrySet();

        for (Map.Entry<String,String> entry:entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        
    }
}
