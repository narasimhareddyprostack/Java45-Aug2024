class Test{
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt("Twenty");
            System.out.println(a*10);
        }
        catch(NumberFormatException nfe){
            //nfe.printStackTrace();
            //System.out.println(nfe.getMessage());
            //System.out.println(nfe.getClass());
            System.out.println(nfe.getMessage());
        }
        
    }
}