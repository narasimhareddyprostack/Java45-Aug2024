package StreamAPI50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

//print all employees their names starts with 'R'/'r'; - without stream and with stream
public class TestThree {
    public static void main(String[] args) {
        List<String> enames=Arrays.asList("Rahul","Sonai","Priyanka",
                "Modi","Rajni","Ravi","Ramesh","Alia","Vijay");

        List<String> new_Names=enames.stream()
                .filter(ename->ename.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println(enames);
        System.out.println(new_Names);

    }
}
