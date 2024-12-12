package FI4;


interface  Function2{
    public  abstract  int findLength(String ename);
}
public class Test4 {
    public static void main(String[] args) {
        Function2 obj=ename->ename.length();
        //how to exexute lambda expression?
        //using FunctionInterface eigther userdefinded or predefined
        System.out.println(obj.findLength("Rahul"));
        System.out.println(obj.findLength("Sonia Gandhi"));
        System.out.println(obj.findLength("Lunch Time"));
    }
}
