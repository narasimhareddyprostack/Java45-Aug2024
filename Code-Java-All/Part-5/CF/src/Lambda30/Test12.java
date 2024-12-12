package Lambda30;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3000,331,4,74,17,41);
        int sec_Lowest = numbers.stream()
                .sorted()
                //.sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(sec_Lowest);

    }
}
