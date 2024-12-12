import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int a = Integer.parseInt(sc.next());
        System.out.println(a*2);
    }
}
