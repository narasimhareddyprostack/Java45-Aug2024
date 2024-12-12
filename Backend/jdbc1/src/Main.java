import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try{
            //load Driver
            System.out.println(Class.forName("java.util.ArrayList"));
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/p2","root","root");
            System.out.println(con);

            String sql_st="create table emp(eid int,ename varchar(32),esal int);";

            Statement st=con.createStatement();
            st.executeUpdate(sql_st);
            System.out.println("Table Created");
            con.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}