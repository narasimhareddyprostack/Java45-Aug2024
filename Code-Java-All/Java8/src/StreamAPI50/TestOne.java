package StreamAPI50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//print all employees their names starts with 'R'/'r'; - without stream and with stream
public class TestOne {
    public static void main(String[] args) {
        List<String> enames=Arrays.asList("Rahul","Sonai","Priyanka",
                "Modi","Rajni","Ravi","Ramesh","Alia","Vijay");
        List<String> new_Names=new ArrayList<String>();
        for (String ename:enames) {
            if(ename.startsWith("R")){
                new_Names.add(ename);
            }
        }
        System.out.println(enames);
        System.out.println(new_Names);

    }
}
