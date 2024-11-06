package FI5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface PTwo{
    public abstract  boolean test(List numbres);
}
public class TestThree {
    static PTwo obj=numbers->numbers.isEmpty();

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,30,40);
        System.out.println(obj.test(al));
    }
}
