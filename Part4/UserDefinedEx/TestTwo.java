class Test{
    public static void m1(){
        System.out.println(10/5);
        //System.out.println(10/0);
        try{
            //throw new ArithmeticException("/ Divide By Zero By Narasimha");
            System.out.println(10/0);
        }
        
        catch(ArithmeticException ae){
            //ae.printStackTrace();
            System.out.println(ae.getMessage());
        }
        System.out.println(10/2);

    }
    public static void main(String[] args) {
        m1();
    }
}