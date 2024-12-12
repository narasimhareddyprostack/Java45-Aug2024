class Test{
    public static void main(String[] args) {
        String ename = new String("Rahul");
        
        String loc ="  BNG  ";
        System.out.println(loc.length());//7
        String new_Loc=loc.trim(); //remove white space and return new string object
        System.out.println("After Trimming");
        System.out.println(new_Loc.length()); //3

        char ch=ename.charAt(0);
        System.out.println(ch);
        int i =  ename.indexOf('a');
        System.out.println(i);

    }
}