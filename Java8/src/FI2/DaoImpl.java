package FI2;
interface DaoI{
    public abstract  void login(); // only declaration
}
public class DaoImpl implements  DaoI{
    public void login(){
        System.out.println("Login success");
    }

    public static void main(String[] args) {
        DaoI obj=new DaoImpl();
        obj.login();
    }
}
