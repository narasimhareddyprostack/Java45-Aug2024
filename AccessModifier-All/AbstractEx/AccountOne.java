abstract class Account{
   public void open_Account(){
    System.out.println("Account Opened Successfully");
   }
   public abstract int get_Bal();
   public abstract void close_Account();
}
class SA extends Account{
    public   int get_Bal() {
        return 100;
    }
    public void close_Account(){
        System.out.println("Account Closed Successfully");
    }
    public static void main(String[] args) {
        //new Account();//we cant create object for abstract classes
        SA obj=new SA();
        obj.open_Account();

        
        int bal= obj.get_Bal();
        
        System.out.println(bal);
        obj.close_Account();
    }
}