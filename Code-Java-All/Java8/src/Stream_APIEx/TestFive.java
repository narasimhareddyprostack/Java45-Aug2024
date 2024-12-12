package Stream_APIEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even_Numbers = numbers.stream()
                                            .filter(num->num%2 ==0)
                                            .collect(Collectors.toList());
        System.out.println(even_Numbers);

        List<Integer> odd_Numbers = numbers.stream()
                .filter(num->num%2 !=0)
                .collect(Collectors.toList());
        System.out.println(odd_Numbers);

        numbers.stream().forEach(number-> System.out.println(number));
        numbers.stream().forEach(System.out::println);


    }
}
