package Lambda30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3000,331,4,74,17,41);
        System.out.println(numbers);
        Stream<Integer> numbers1= numbers.stream();
        Stream<Integer> numbers2=Stream.of(3000,331,4,74,17,41);
        System.out.println(numbers1);
        System.out.println(numbers2);
        numbers1.forEach(num-> System.out.println(num));
    }
}
