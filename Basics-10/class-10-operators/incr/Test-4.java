class Test1{
    public static void main(String[] marks) {
        int a=10;
        //int b=a++;  //first assign and then incr
        int b=++a;  //first incrementing and then assign
        System.out.println(a);  
        System.out.println(b); 
    }
}