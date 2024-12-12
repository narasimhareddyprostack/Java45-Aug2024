package FI6_All;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestFive {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(100,200,300,400);
        Consumer<List> c= (nums)->{
            for (Object number:nums) {
                System.out.println(number);
            }
        };
        c.accept(numbers);
    }
}
