class Account{
    String acc_Name;
    String acc_Email;
    Account(String name, String email){
        this.acc_Name=name;
        this.acc_Email=email;
    }
}
class SA extends Account{
    int acc_Id;
    double acc_Bal;
    static double min_Bal=500;
    SA(int id, String name, double bal,String email){
        super(name, email);
        this.acc_Id = id;
        this.acc_Bal = bal;
    }
}
public class TestOne {
    public static void main(String[] args) {
        new SA(101,"Rahul",5000,"Rg@gmail.com");
    }
}
