interface P1{
    public abstract void m1();
}
interface P2{
    public abstract void m2();
}
class Child implements P1,P2{
    public void m1(){
        System.out.println("Child m1 method");
    }
    public void m2(){
        System.out.println("Child m2 method");
    }
}
public class TestFive {
    public static void main(String[] args) {
       Child c1=new Child();
       c1.m1();
       c1.m2();
    }
}
