package FI3;

interface FunctionI{
    public abstract  int squreIt(int num);
}
public class TestOne implements  FunctionI{
    public  int squreIt(int num){
        return num*num;
    }
    public static void main(String[] args) {
       FunctionI obj=new TestOne();
        System.out.println(obj.squreIt(10));
        System.out.println(obj.squreIt(4));
    }
}
