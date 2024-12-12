import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
    public static void main(String[] args) {
        try{
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/p2","root","root");
            System.out.println(con);
            Statement st=con.createStatement();
            String sql_st="select * from emp";
            ResultSet rs=st.executeQuery(sql_st);
            while (rs.next()){
                int emp_Id = rs.getInt(1);
                String emp_Name=rs.getString(2);
                System.out.println("Employee Id"+emp_Id + "- "+"Employee Name"+emp_Name);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
