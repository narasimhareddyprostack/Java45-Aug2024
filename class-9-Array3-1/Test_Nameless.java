class Test {
    public static void main(String[] args) {
        getData(new int[] {10,20,30,40});
    }
    public static void getData(int[] numbers){
        for (int i : numbers) {
                System.out.println(i);  //10,20,30,40
        }
    }

}
