package CF.src.LinkedHashSetEx;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class ArraysEx {
    public static void main(String[] args) {
      Integer[] prices={100,50,300,200,199};

      List<Integer> new_Prices=Arrays.asList(prices);

      Collections.sort(new_Prices);
      System.out.println(new_Prices);
    }
}
