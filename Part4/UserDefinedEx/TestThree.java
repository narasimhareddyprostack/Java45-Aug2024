class LowBalException extends Exception{
    LowBalException(String msg){
        super(msg);
    }
}
class Account{
    public void withdrawl(int amount) throws LowBalException{
        int acc_Bal = 500;
        if(acc_Bal > amount){
            System.out.println("Go And Enjoy");
        }
        else{
                throw new LowBalException("Go to PSA and Practice");
        }
    }
    public static void main(String[] args) throws LowBalException {
        new Account().withdrawl(4500);
    }
}