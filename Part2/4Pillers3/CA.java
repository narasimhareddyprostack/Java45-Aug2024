public class CA extends Account {
      private int acc_Id;
      private  int acc_Bal;
      private  int min_Bal;

      public CA(int id,String name,String email,int bal,String loc){
            super(name,email,loc);
            this.acc_Id = id;
            this.acc_Bal = bal;
      }
    public int getAcc_Id() {
        return acc_Id;
    }
    public void setAcc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
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
        System.out.println(this.acc_Bal - this.min_Bal);
    }
}
