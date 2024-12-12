package StreamAPI50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//print all employees their names starts with 'R'/'r'; - without stream and with stream
public class TestTwo {
    public static void main(String[] args) {
        List<String> enames=Arrays.asList("Rahul","Sonai","Priyanka",
                "Modi","Rajni","Ravi","Ramesh","Alia","Vijay");
        List<String> new_Names=new ArrayList<String>();
        Iterator<String> itr = enames.iterator();
        while(itr.hasNext()){
            if(itr.next().startsWith("R")){
                new_Names.add(itr.next());
            }
        }
        System.out.println(enames);
        System.out.println(new_Names);

    }
}
