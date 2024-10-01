class Test{
    public static void main(String[] args) {
       SA sa1=new SA("Rahul", "Rahul@gmail.com", "Wayanad", 101, 50000);
       sa1.setMin_Bal(600);
       CA ca1=new CA(102, "Sonia", "Sonia@gmail.com", 75000, "New Delhi");
       ca1.setMin_Bal(24999);
       AccountService.get_Services(sa1);
       AccountService.get_Services(ca1);
    }
}
