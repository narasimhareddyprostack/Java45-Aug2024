public class PaymentService {
    private String status;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public static void main(String[] args) {
        PaymentService    ps=new PaymentService();
        ps.setStatus("Yes");

        String acc_Status = ps.getStatus();
        System.out.println(acc_Status);
    }
}
