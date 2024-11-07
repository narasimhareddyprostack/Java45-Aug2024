package Optional_Date_Time;

import java.util.Optional;

public class TestTwo {
    public static void main(String[] args) {
        //String ename = "Rahul";
        String ename = null;
        Optional<String> opt = Optional.ofNullable(ename);
        if(opt.isPresent()){
            System.out.println(opt.get().length());
        }
        System.out.println("GM");
    }
}
