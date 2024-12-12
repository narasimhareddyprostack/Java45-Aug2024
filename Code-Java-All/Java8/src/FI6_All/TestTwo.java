package FI6_All;

import java.util.Random;

@FunctionalInterface
interface  SOne{
    public  abstract  int get();
}
public class TestTwo implements  SOne{
    public int get(){
        Random r = new Random();
        return r.nextInt(100);
    }
    public static void main(String[] args) {
        SOne s1=new TestTwo();
        System.out.println(s1.get());
    }
}
