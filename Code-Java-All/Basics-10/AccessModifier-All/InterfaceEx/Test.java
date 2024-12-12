interface A{
    public abstract void m1();
}
interface B{
    public abstract void m2();
}
class Test implements A,B{
    public void m1(){}
    public void m2(){}
    public static void main(String[] args) {
        Test t= new Test();
        t.m1();
        t.m2();
    }
}