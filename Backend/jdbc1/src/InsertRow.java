import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRow {
    public static void main(String[] args) {
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/p2","root","root");
            System.out.println(con);
            Statement st =con.createStatement();

            String sql_st="insert into emp values(102,'Sonia',55000);";
            st.executeUpdate(sql_st);
            System.out.println("Data Inserted");
            con.close();

        }
        catch (Exception e){
        e.printStackTrace();
        }
    }
}
