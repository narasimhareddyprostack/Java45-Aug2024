interface DaoI{
   public abstract void login();
   public abstract void logout();
}
interface USI{
   public abstract void forgetPassword();
}
class DaoImpl implements DaoI,USI{
    public void login(){
        System.out.println("Login Success");
    }
    public void logout(){
        System.out.println("Logout Sucess");
    }
    public void forgetPassword(){
        System.out.println("Password Updated Successfully");
    }
}
public class Multiple{
    public static void main(String[] args) {
        DaoImpl obj=new DaoImpl();
    
        obj.login();
        obj.logout();
        obj.forgetPassword();
    }
}