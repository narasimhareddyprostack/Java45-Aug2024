class Test1{
    public static void main(String[] marks) {
       int a=10;
       int b = (++a)++;
       System.out.println(b);
    }
}
/*
 *              ^
  required: variable
  found:    value
 */