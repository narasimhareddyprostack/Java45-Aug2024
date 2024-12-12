package Lambda30;

import java.util.Arrays;
import java.util.List;

public class Test1_1 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3000,331,34,74,17,41,3,23,45,67);
        int sum=numbers.stream()
                       .reduce((a,b)->a+b)
                       .get();
        System.out.println(sum);
    }
}
