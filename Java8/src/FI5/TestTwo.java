package FI5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface POne{
   public abstract boolean test(List numbers);
}public class TestTwo implements  POne {
    public boolean test(List numbers){
        return numbers.isEmpty();
    }
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,30,40,50);
        POne obj=new TestTwo();
        boolean result =obj.test(al);
        System.out.println(result);
    }
}
