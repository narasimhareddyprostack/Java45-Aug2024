class Test{
    public static void main(String[] args) {
      int[] numbers={1,2,3,4,5,6,7,8,9};
      int[][] two_D={{1,2,3},{4,5,6},{7,8,9}};
      int sum=0;
      for(int num:numbers){
        sum=sum+num;
      }
      System.out.println(sum);
    }
}