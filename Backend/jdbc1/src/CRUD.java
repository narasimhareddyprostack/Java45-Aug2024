import java.sql.*;
import java.util.Scanner;

public class CRUD {
    //load driver
    static Connection con;
    static Scanner sc = new Scanner(System.in);
    static CRUD obj=new CRUD();
    public static void main(String[] args) {
        try{
            //establish connection
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/p2","root","root");
            System.out.print("Choose Option 1.Insert Data 2.Read Data 3.Update Data 4.Delete Data 5.All Employee");
            int opt = Integer.parseInt(sc.nextLine());
            System.out.println(opt);
            switch (opt){
                case 1:
                    obj.insertData();
                    break;
                case 2:
                    obj.readData();
                    break;
                case 3:
                    obj.updateData();
                    break;
                case 4:
                    obj.deleteData();
                    break;
                case 5:
                    obj.readAllEmployee();
                    break;
                default:
                    obj.chooseOption();

            }
        }
        catch (Exception e){

        }

    }
    public void insertData() throws SQLException {
        String sql_st="insert into employee values(?,?,?);";
        System.out.println(con);
        PreparedStatement st=con.prepareStatement(sql_st);

        System.out.println("Enter Employee Id");
        st.setInt(1,Integer.parseInt(sc.nextLine()));

        System.out.println("Enter Employee Name");
        st.setString(2,sc.nextLine());

        System.out.println("Enter Employee Sal");
        st.setInt(3,Integer.parseInt(sc.nextLine()));

        int rows=st.executeUpdate();

        System.out.println(rows);
        if(rows>0){
            System.out.println("Data Inserted");
        }
        else{
            System.out.println("Not Inserted");
        }

    }
    public void readData(){
        try{
            System.out.println("Enter Employee Id");
            int empId = Integer.parseInt(sc.nextLine());
            String sql_st = "select * from employee where eid="+empId;
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql_st);
            if(rs.next()){
                String ename=rs.getString(2);
                int esal = rs.getInt(3);
                System.out.println("Employee Name"+ename+"-"+"Salary:"+esal);
            }
        }
        catch (Exception sq){
            sq.printStackTrace();
        }

    }
    public void updateData() throws  SQLException{
        String sql_st = "update employee set ename=? where eid=?;";
        PreparedStatement st=con.prepareStatement(sql_st);
        System.out.println("Enter Employee Name:");
        String ename=sc.nextLine();
        st.setString(1,ename);
        System.out.println("Enter Employee ID:");
        int eid= Integer.parseInt(sc.nextLine());
        st.setInt(2,eid);
        int rows=st.executeUpdate();
        if(rows>0){
            System.out.println("Data Updated");
        }else{
            System.out.println("Not Updated");
        }
    }
    public void deleteData() throws  SQLException{
        System.out.println("Enter Employee Id:");
        int empId=Integer.parseInt(sc.nextLine());
        String sql_st="delete from employee where eid="+empId;
        Statement st=con.createStatement();
        int row=st.executeUpdate(sql_st);
        if(row>0){
            System.out.println("Employee Record Deleted");
        }
        else{
            System.out.println("Not deleted");
        }
    }
    public void chooseOption(){}
    public void readAllEmployee(){
        try{

            String sql_st = "select * from employee";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql_st);
            while(rs.next()){
                int eid = rs.getInt(1);
                String ename=rs.getString(2);
                int esal = rs.getInt(3);
                System.out.println("Id-"+eid+"-Employee Name"+ename+"-"+"Salary:"+esal);
            }
        }
        catch (Exception sq){
            sq.printStackTrace();
        }
    }
}
