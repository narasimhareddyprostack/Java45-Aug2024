class Parent{
        public final void m1(){
            System.out.println("Parent class m1 method");
        }
}
class Child extends Parent{
    public void m1(){ //final method, overriding is not possible
        System.out.println("Child class m1 method");
    }
}

class TestTwo {
    
}
