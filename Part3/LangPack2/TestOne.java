class A{}
class B extends A{}
public class TestOne {
    public static void main(String[] args) {
        int sal1=45000;
        int sal2=45000;
        A a=new A(); 
        B b=new B(); 
        System.out.println(a.equals(b));
        System.err.println(a==b);

    }
}
