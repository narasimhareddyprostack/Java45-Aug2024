public class TestTwo {
    public TestTwo(int a, int b, int c ,int d,int e){
        System.out.println("Constructor method execute automaticallly  only once.");
    }
    public static void main(String[] args) {
        new TestTwo(10,20,30,40,50);
        new TestTwo(10,20,30,40,50);
    }
}
