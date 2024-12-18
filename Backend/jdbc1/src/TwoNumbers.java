import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id Number");
        int empId = Integer.parseInt(sc.next());
        System.out.println("Enter Employee Name");
        String empName = sc.next();
        System.out.println(empId + "-"+empName);
    }
}
