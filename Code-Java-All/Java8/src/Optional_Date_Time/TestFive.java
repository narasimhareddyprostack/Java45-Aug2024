package Optional_Date_Time;

import java.time.LocalDate;
import java.time.Period;

//Print age of user
public class TestFive {
    public static void main(String[] args) {
       LocalDate dob = LocalDate.of(1984,07,11);
       System.out.println(dob);
       LocalDate cdt = LocalDate.now();
       System.out.println(cdt);
       Period pd=Period.between(dob,cdt);
       System.out.println(pd);
        System.out.println(pd.getYears()+"/"+pd.getMonths()+"/"+pd.getDays());
    }
}
