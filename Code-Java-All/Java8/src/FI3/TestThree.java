package FI3;

import java.util.function.Function;

public class TestThree {
    public static void main(String[] args) {
        Function<Integer,Integer> obj = num->num*num;
        System.out.println(obj.apply(10));
        System.out.println(obj.apply(4));
    }
}
