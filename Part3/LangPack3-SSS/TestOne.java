class Test{
    public static void main(String[] args) {
        String ename1 ="Rahul";
        
        String ename2= new String("Rahul");

        ename1=ename1.concat("Gandhi");
        System.out.println(ename1); //RahulGandhi
    }
}