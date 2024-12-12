package FI5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class TestFour {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,30,40,50);
        Predicate<List> obj1 = numbers->numbers.isEmpty() ;
        Function<List,Integer> obj2=numbers->numbers.size() ;
        System.out.println(obj1.test(al));
        System.out.println(obj2.apply(al));
    }

}
