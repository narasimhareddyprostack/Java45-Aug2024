package Lambda30;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Lambda with cusomter Sorting
public class Test24_1 {
    public static void main(String[] args) {
     List<Integer> numbers=Arrays.asList(3000,331,4,74,17,41);
     System.out.println(numbers);  //[3000, 331, 4, 74, 17, 41]
     List<Integer> sorted_List_Numbers=numbers.stream()
             .sorted(Comparator.reverseOrder())
             .collect(Collectors.toList());
        System.out.println(sorted_List_Numbers); //[3000, 331, 74, 41, 17, 4]
    }
}
