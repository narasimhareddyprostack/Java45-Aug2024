import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateRec {
    public static void main(String[] args) {
        try {

            //establic db connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/p2","root","root");
            System.out.println(con);
            Statement st = con.createStatement();
            int row=st.executeUpdate("insert into employee values(101,'rahul',45001);");
            if(row >0){
                System.out.println("Data Inserted");
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
