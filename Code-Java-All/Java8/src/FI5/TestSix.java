package FI5;

import java.util.Arrays;
import java.util.List;

public class TestSix implements  FOne{
    public int apply(List numbers){
        return numbers.size();
    }

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,30,40,50);
        FOne obj=new TestSix();
        System.out.println(obj.apply(al));
    }
}
