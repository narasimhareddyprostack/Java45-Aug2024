public  class  Account extends Bank{
    private String acc_Name;
    private String acc_Email;
    private String loc;
    // generate setters and getters , constrcutor
    
    
  
    
    public  void cal_Bal(){}




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




    public Account(String acc_Name, String acc_Email, String loc) {
        this.acc_Name = acc_Name;
        this.acc_Email = acc_Email;
        this.loc = loc;
    }
}
