package pack2;
import pack1.A;
public class C extends A{
    public void m6(){
        System.out.println("pack2 - Class c - public mehtod m6");
    }
    
    public static void main(String[] args) {
         C c1=new C();
         c1.m1();
         //c1.m2();
         c1.m3();
         c1.m6();
      }    
}
