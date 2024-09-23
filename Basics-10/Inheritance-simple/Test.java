class Parent{
    void m1(){}
    void m2(){}
}
class Child extends Parent{
    void m3(){}
}
class Test{
    public static void main(String[] args) {
       Parent p1 = new Parent();
       p1.m1();
       p1.m2();
       Child c1=new Child();
       c1.m1();
       c1.m2();
       c1.m3();
       //Child p2=new Parent();
       Parent c2=new Child();
       c2.m1();
       c2.m2();
       c2.m3();
    }
}