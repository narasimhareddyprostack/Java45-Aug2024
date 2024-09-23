interface Account{
  public abstract  int get_Bal();
  public abstract void close_Account();
}
class SA implements Account{
    public   int get_Bal(){
        return 100;
    }
    public  void close_Account(){
    System.out.println("Account closed successfully");
    }
    public static void main(String[] args) {
        SA obj = new SA();
        System.out.println(obj.get_Bal());
        obj.close_Account();
    }
}