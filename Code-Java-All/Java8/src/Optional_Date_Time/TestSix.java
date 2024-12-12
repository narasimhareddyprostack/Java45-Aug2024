package Optional_Date_Time;

import java.time.LocalDate;

public class TestSix {
    public static void main(String[] args) {
        int year=LocalDate.now().getYear();
        System.out.println(year);
        if(year%4 ==0){
            System.out.println("Curret Year is Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
