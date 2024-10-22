class LowBalException extends Exception{
    LowBalException(String msg){
        super(msg);
    }
}
class Account{
    public void withdrawl(int amount) {
        int acc_Bal = 100;
        try {
            if(acc_Bal > amount){
                System.out.println("Go And Enjoy");
            }
            else{
                    throw new LowBalException("Go to PSA and Practice");
            }
        } catch (LowBalException e) {
            System.out.println(e.getMessage());
        }
       
    }
    public static void main(String[] args)  {
        new Account().withdrawl(4500);
    }
}