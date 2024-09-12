class Test{
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args) {
           Test t1=new Test();
           Test t2=new Test();
           t2.b=20;
           System.out.println(t1.a+t1.b+t1.c);
           System.out.println(t2.a+t2.b+t2.c);
           t1.c=30;
           System.out.println(t1.a+t1.b+t1.c);
           System.out.println(t2.a+t2.b+t2.c);


    }
}