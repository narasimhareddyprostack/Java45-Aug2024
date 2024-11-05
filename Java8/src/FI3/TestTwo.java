package FI3;


interface  FunctionIOne{
    public abstract  int squreIt(int num);
}
public class TestTwo {
    public static void main(String[] args) {
        FunctionIOne obj=num -> num*num;
        System.out.println(obj.squreIt(10));
        System.out.println(obj.squreIt(4));
    }
}
