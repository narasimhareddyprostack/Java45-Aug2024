import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Test{
    public static void main(String[] args) {
        try {
            PrintWriter pw=new PrintWriter("abc.text");
        }
        catch(FileNotFoundException fnfEx){
            fnfEx.printStackTrace();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
}