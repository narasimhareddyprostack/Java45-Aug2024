package Stream_APIEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFour {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,19);
        List<Integer> even_Numbers = new ArrayList<Integer>();
        List<Integer> odd_Numbers = new ArrayList<Integer>();
        for(Integer num:numbers){
            if(num%2 ==0){
                even_Numbers.add(num);
            }
            else{
            odd_Numbers.add(num);
            }
        }
        System.out.println(numbers);
        System.out.println(even_Numbers);
        System.out.println(odd_Numbers);


    }
}
