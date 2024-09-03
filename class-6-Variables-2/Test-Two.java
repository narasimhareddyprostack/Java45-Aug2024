public class Test {

    int a; //instance vairable or object level
    static int b;  //static variable or class level variable
    public static void main(String[] args) {
        int c=300;  //local variable 
        Test t1=new Test();
        System.out.println(t1.a);
        System.out.println(b);
        System.out.println(t1.b);
        System.out.println(Test.b);
    }
}
