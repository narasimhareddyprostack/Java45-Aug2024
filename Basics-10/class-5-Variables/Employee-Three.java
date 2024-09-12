class Employee{
     int eid=10;
    public  void m1(){
        System.out.println("Employe Class - m1 method");
    }
    public static void main(String[] args) {
        //how to access non-static members-using object
        Employee e1=new Employee();
        System.out.println(e1.eid);
        e1.m1();
    }
}