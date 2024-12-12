public class Test {
    public static void main(String[] args) {
        SA sa1=new SA(101,"Rahul",5000.00,"Rahul@gmail.com");
        sa1.setMin_Bal(500);
        double bal1 = sa1.cal_Bal();
        System.out.println(bal1);

        CA ca1=new CA(1001,"Priyanka",700000,"priyanka@gmail.com");
        ca1.setMin_Bal(25000.00);
        double bal2 = ca1.cal_Bal();
        System.out.println(bal2);
    }
}
