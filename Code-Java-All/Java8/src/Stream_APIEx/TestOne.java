package Stream_APIEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestOne {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("rahul","sonai","priya","modi");
        ArrayList<String> users=new ArrayList<String>();
        users.add("rahul");
        users.add("sonia");
        users.add("priyanka");
        users.add("modi");
        System.out.println(enames);
        System.out.println(users);
        //process your users  and convert every user to  upper case.
        ArrayList<String> new_Users=new ArrayList<String>();
        for (String user:users) {
            new_Users.add(user.toUpperCase());
        }
        System.out.println(new_Users);


    }
}
