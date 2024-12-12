public class Account {
    private int acc_Id;
    private String acc_Name;
    private double acc_Bal;
    //generate setter and getters

    public int getAcc_Id() {
        return acc_Id;
    }

    public void setAcc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
    }

    public String getAcc_Name() {
        return acc_Name;
    }

    public void setAcc_Name(String acc_Name) {
        this.acc_Name = acc_Name;
    }

    public double getAcc_Bal() {
        return acc_Bal;
    }

    public void setAcc_Bal(double acc_Bal) {
        this.acc_Bal = acc_Bal;
    }

    public static void main(String[] args) {
        Account a1=new Account();
        a1.setAcc_Id(101);
        a1.setAcc_Name("Rahul");
        a1.setAcc_Bal(5000);
        System.out.println("Acc Id:"+a1.getAcc_Id()+": and Name:"+a1.getAcc_Name());
    }
}
