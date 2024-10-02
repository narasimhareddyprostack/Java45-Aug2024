public class B {
    public String toString(){
        return "Hello, Class B";
    }
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b);
        System.out.println(b.toString());
    }    
}
//Note: we are overriding Object class to STring method
// meaningful value of object
