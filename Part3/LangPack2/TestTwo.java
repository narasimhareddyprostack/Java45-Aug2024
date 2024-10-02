class A{}
public class TestTwo{
    public static void main(String[] args) {
        A a=new A();
        String ename1="Rahul";
        String ename2=new String("Rahul");
        String ename3="Rahul";

        System.out.println(ename1.equals(ename2));//true
        System.out.println(ename1 == ename2);//false
        
        System.out.println(ename1.equals(ename3));//true
        System.out.println(ename1 == ename3);//true
        System.out.println(a.equals(ename1));  //false
        System.out.println(a == ename1);  //false
    }
}