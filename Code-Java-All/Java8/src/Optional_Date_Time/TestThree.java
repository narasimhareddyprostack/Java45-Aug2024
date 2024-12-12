package Optional_Date_Time;

import java.time.LocalDate;
import java.time.LocalTime;
//print current date and time
public class TestThree {
    public static void main(String[] args) {
        LocalDate dt=LocalDate.now();
        LocalTime time=LocalTime.now();
        System.out.println(dt);
        System.out.println(time);
    }
}
