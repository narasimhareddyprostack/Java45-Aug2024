import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRec {
    public static void main(String[] args) {
        try{
                //load driver
                //establish connection
            Scanner sc = new Scanner(System.in);
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/p2","root","root");
            String sql_st = "update employee set ename=? where eid=?;";
            PreparedStatement st=con.prepareStatement(sql_st);
            System.out.println("Enter Employee Name:");
            String ename = sc.nextLine();
            st.setString(1,ename);
            System.out.println("Enter Emploee Id");
            st.setInt(2,Integer.parseInt(sc.nextLine()));
            int rows=st.executeUpdate();
            if(rows>0){
                System.out.println("Updated");
            }
            else{
                System.out.println("Not Updted");
            }

        }
        catch (Exception e){
         e.printStackTrace();
        }
    }
}
