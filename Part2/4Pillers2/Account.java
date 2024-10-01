public  class  Account extends Bank{
    private String acc_Name;
    private String acc_Email;
    private String loc;
    // generate setters and getters
    
    public Account(String name,String email,String loc){
        this.acc_Name=name;
        this.acc_Email=email;
        this.loc=loc;
    }
    public String getAcc_Name() {
        return acc_Name;
    }
    public void setAcc_Name(String acc_Name) {
        this.acc_Name = acc_Name;
    }
    public String getAcc_Email() {
        return acc_Email;
    }
    public void setAcc_Email(String acc_Email) {
        this.acc_Email = acc_Email;
    }
    public String getLoc() {
        return loc;
    }
    public void setLoc(String loc) {
        this.loc = loc;
    }
    public  void cal_Bal(){}
}
