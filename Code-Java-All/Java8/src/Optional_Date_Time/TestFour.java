package Optional_Date_Time;

import java.time.LocalDate;
import java.time.LocalTime;

//print current date and time
public class TestFour {
    public static void main(String[] args) {
        LocalDate dt=LocalDate.now();
        LocalTime time=LocalTime.now();
        System.out.println(dt.getYear()+":"+ dt.getDayOfMonth()+":"+dt.getDayOfYear());
        System.out.println(time.getHour()+"-"+time.getMinute()+"-"+time.getSecond());
    }
}
