package CF.src.HashMapEx;

import java.util.*;

public class HashMapThree {
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
        Collection<String> values=product.values();
        System.out.println(values);//[Marker Pen, 30, false, p101]
        for (String value:values) {
            System.out.println(value);
        }

        
    }
}
