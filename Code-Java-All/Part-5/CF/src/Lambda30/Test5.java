package Lambda30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3000,331,34,74,17,41,3,23,45,67);
        List<String> new_Numbers=numbers.stream()
                .map(num->String.valueOf(num))
                .filter(num->num.startsWith("3"))
                .collect(Collectors.toList());
        System.out.println(new_Numbers);

    }
}
