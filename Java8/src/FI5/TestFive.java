package FI5;

import java.util.Arrays;
import java.util.List;

interface FOne{
    public abstract  int apply(List numbers);
}
public class TestFive {

    static FOne  obj  = numbers->numbers.size();
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,30,40,50);
        System.out.println(obj.apply(al));
    }
}
