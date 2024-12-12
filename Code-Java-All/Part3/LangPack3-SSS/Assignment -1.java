class A{}
class B{}
class C extends B{}
public class Assignment {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=100;
        String ename1="Rahul";
        String ename2=new String("Rahul");
        StringBuffer enames3=new StringBuffer("Rahul");
        
        A obj1=new A();
        B obj2= new B();
        C obj3= new C();

        System.out.println(a==b); //false
        System.out.println(a==c); //true
        //System.out.println(a==ename1);//CE
        //System.out.println(a.equals(c));//CE

    }
}
