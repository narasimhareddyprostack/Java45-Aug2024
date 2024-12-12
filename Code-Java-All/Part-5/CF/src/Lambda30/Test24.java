package Lambda30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Lambda with cusomter Sorting
public class Test24 {
    public static void main(String[] args) {
     List<Integer> numbers=Arrays.asList(3000,331,4,74,17,41);
     System.out.println(numbers);  //[3000, 331, 4, 74, 17, 41]
     Collections.sort(numbers);
     System.out.println(numbers);// [4, 17, 41, 74, 331, 3000]
    }
}
