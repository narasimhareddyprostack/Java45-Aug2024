class Test{
    //What is unboxing?
    public static void main(String[] args) {
       Integer a = Integer.valueOf(10);
       int b = a; //unboxing
       //int b = a.intValue(); 
        byte c = a.byteValue();
        //byte c = a;
       float d = a.floatValue();
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);

    }
}