package Stream_APIEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestTwo {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("rahul","sonai","priya","modi","amith","vijay");

        List<String> new_Employees=enames.stream()
                                         .map(ename -> ename.toUpperCase())
                                         .collect(Collectors.toList());
        System.out.println(new_Employees);



    }
}
