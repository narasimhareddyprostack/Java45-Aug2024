public class TestService {

    public static void main(String[] args) {
    PaymentService    ps=new PaymentService();
    ps.setStatus("Yes");

    String acc_Status = ps.getStatus();
        System.out.println(acc_Status);
    }
}
