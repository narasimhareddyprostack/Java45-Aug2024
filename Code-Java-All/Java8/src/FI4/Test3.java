package FI4;

import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) {
        Function<String,Integer> obj = ename->ename.length();
        System.out.println(obj.apply("Rahul"));
        System.out.println(obj.apply("Sonia Gandhi"));
    }
}
