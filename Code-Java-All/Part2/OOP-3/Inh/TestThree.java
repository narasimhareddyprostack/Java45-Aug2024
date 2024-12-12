class Parent{
    public void m1(){
        System.out.println("Parent class m1 method");
    }
    public void m2(){
        System.out.println("Parent class m2 method");
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("Child class m3 method");
    }
}

public class TestThree {
    public static void main(String[] args) {
       int    a=100;
      Parent  p1=new Parent();
      p1.m1();
      p1.m2();
      //p1.m3();
      Child c1=new Child();
      c1.m1();
      c1.m2();
      c1.m3();
      Parent  p2=new Child();
      p2.m1();
      p2.m2();
      //p2.m3();

      Child obj=new Parent();
    }    
}
