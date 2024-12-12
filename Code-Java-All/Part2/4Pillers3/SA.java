public class SA extends Account {
    private int acc_Id;
    private int acc_Bal;
    private int min_Bal;
    //generate setters and getters
    
    
    public void cal_Bal(){
        System.out.println(this.acc_Bal - this.getMin_Bal());
    }


    public int getMin_Bal() {
        return min_Bal;
    }


    public void setMin_Bal(int min_Bal) {
        this.min_Bal = min_Bal;
    }


    public SA(String acc_Name, String acc_Email, String loc, int acc_Id, int acc_Bal) {
        super(acc_Name, acc_Email, loc);
        this.acc_Id = acc_Id;
        this.acc_Bal = acc_Bal;
    }
    

}
