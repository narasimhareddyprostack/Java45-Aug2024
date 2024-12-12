package Optional_Date_Time;

import java.time.LocalDate;
import java.time.Year;

public class TestSeven {
    public static void main(String[] args) {
       Year year = Year.of(2023);
       if(year.isLeap()){
           System.out.println("Yes Leap Year");
       }
       else{
           System.out.println("Not a Leap Year");
       }
    }
}
