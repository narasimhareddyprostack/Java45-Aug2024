package Lambda30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test6_1 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3000,331,4,74,17,41);
        numbers.stream()
                .forEach(System.out::println);
    }
}
