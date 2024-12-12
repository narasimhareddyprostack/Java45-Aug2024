class Test{
    //Primitive DT to String
    public static void main(String[] args) {
    int a=10;
    Integer i =a;//autoboxing
    Integer  i1 = Integer.valueOf(a);//primitive to Object

    String s1 = i.toString(); //Object to String
    int b = Integer.parseInt(s1); //String to primitive 
    int c = i.intValue();  //object to primitive
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(i);
    System.out.println(s1);
    }
}