class Test{
    //What is autoboxing?
    public static void main(String[] args) {
        Integer  i = 10;  //Autoboxing
        //Integer i = Integer.valueOf(10);
        System.out.println(i);
        System.out.println(i.byteValue());
        System.out.println(i.shortValue());
        System.out.println(i.intValue());
        System.out.println(i.floatValue());
        System.out.println(i.doubleValue());        
    }
}