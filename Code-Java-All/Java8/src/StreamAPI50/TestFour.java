package StreamAPI50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//print no_of_Employee their names starts with 'R'/'r'; - without stream and with stream
public class TestFour {
    public static void main(String[] args) {
        List<String> enames=Arrays.asList("Rahul","Sonai","Priyanka",
                "Modi","Rajni","Ravi","Ramesh","Alia","Vijay");

        long no_of_Employees=enames.stream()
                .filter(ename->ename.startsWith("R"))
                .count();
        System.out.println(no_of_Employees);

    }
}
