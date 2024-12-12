package FI6_All;

import java.util.Random;
import java.util.function.Supplier;

public class TestFour {
    public static void main(String[] args) {
        Random r = new Random();
        Supplier<Integer> s1= ()->r.nextInt();
        Supplier<Float>  s2 = ()->r.nextFloat();
        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}
