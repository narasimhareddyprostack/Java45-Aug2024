class Test{
    public static void main(String[] args) {
        
       String[] enames={"Rahul","Sonia","Priyanka"};
        System.out.println(enames);//[java.lang.S@abc24223
        
        for (String ename : enames) {
                System.out.println(ename);
        }
       
    }
}