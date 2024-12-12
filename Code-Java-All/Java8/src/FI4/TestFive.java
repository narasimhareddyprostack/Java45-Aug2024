package FI4;
interface Function3{
    public  abstract  int findByLength(String ename);
}
public class TestFive implements  Function3{
    public  int findByLength(String ename){
        return ename.length();
    }
    public static void main(String[] args) {
       Function3 obj=new TestFive();
        System.out.println(obj.findByLength("Rahul"));
        System.out.println(obj.findByLength("Sonia"));
        System.out.println(obj.findByLength("Lunch Time"));
    }
}
