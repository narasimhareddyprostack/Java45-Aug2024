class GrandParent{
    public void m1(){}
    public void m2(){}
}
class Parent extends GrandParent{
    public void m3(){}
}
class Child extends Parent{
    public void m4(){}
}

public class TestTwo {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        c1.m4();
    }
}
