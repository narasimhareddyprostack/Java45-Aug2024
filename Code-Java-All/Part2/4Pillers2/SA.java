public class SA extends Account {
    private int acc_Id;
    private int acc_Bal;
    private int min_Bal;
    //generate setters and getters
    
    public SA(int id,String name,String email,int bal,String loc){
       super(name, email, loc);
       this.acc_Id=id;
       this.acc_Bal=bal;
    }

    public int getAcc_Bal() {
        return acc_Bal;
    }

    public void setAcc_Bal(int acc_Bal) {
        this.acc_Bal = acc_Bal;
    }

    public int getMin_Bal() {
        return min_Bal;
    }

    public void setMin_Bal(int min_Bal) {
        this.min_Bal = min_Bal;
    }
    public void cal_Bal(){
        int bal=this.getAcc_Bal();
        System.out.println(bal - this.getMin_Bal());
    }
    
}
