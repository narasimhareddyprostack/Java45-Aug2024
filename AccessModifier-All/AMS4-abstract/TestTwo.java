abstract class A{
        public abstract void m1();
}
abstract class B extends A{
        public abstract void m1();
}
class Test{
    public static void main(String[] args) {
        new B();
    }
}