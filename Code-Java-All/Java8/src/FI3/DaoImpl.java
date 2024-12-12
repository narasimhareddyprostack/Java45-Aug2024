package FI3;

@FunctionalInterface
interface  DaoI{
   public abstract void login();//only declaration
}
public class DaoImpl {
    public static void main(String[] args) {
       DaoI obj =()->{
            System.out.println("Login Success");
        };
       //how to execute lambda expression
        obj.login();
    }
}
