public class SA extends Account{
    private double min_Bal;
    private int acc_Id;
    private double acc_Bal;
    public SA(int id,String name,double bal,String email){
        super(name,email);
        this.acc_Id =id;
        this.acc_Bal = bal;
    }
    //generate setter and getting
    public double getMin_Bal() {
        return min_Bal;
    }
    public void setMin_Bal(double min_Bal) {
        this.min_Bal = min_Bal;
    }
    public double cal_Bal(){
        double bal = this.acc_Bal - this.getMin_Bal();
        return bal;
    }
    

}
