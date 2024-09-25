interface DaoI{
           void login();
           void logout();
}
interface USI extends DaoI{
           void forgetPassword();
}
class USImpl implements USI{
        public void login(){
            System.out.println("Login Success");
        }
        public void logout(){
            System.out.println("Logout success");
        }
        public void forgetPassword(){
            System.out.println("Updated Success");
        }
}
public class MultipleOne {
    public static void main(String[] args) {
        USImpl obj=new USImpl();
        obj.login();
        obj.logout();
        obj.forgetPassword();
    }
}
