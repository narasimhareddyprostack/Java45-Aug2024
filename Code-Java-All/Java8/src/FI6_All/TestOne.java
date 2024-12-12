package FI6_All;

import java.util.function.Supplier;

public class TestOne {
    public static void main(String[] args) {
        Supplier<String> s1 = ()->"Good Morning";
        System.out.println(s1.get());

        Supplier<Integer> s2 = ()->100;
        System.out.println(s2.get());
    }
}
