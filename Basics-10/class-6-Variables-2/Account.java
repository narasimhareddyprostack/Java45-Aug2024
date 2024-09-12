class Account{
    int acc_Id;
    String acc_Name;
    double acc_Bal;
    static double min_Bal=2000;
    static String branch_Name="SBI";

    public static void main(String[] args) {
       Account a1=new Account();
       Account a2=new Account();
       Account a3=new Account();

       System.out.println(a2.acc_Id);
       System.out.println(a2.acc_Name);
    }
}