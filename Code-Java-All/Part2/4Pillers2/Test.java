public class Test{
    public static void main(String[] args) {
       //new Bank(); 
       //new Account("Rahul","rg@gmail.com","Wayanad");
    SA sa1=new SA(101,"Rahul","rg@gmail.com",5000,"Wayanad");

    sa1.setMin_Bal(600);
    sa1.cal_Bal();
    CA ca1=new CA(102,"Priyanka","pg@gmail.com",75000,"New Delhi");
    ca1.setMin_Bal(25000);
   

    ca1.cal_Bal();
    

    }
}