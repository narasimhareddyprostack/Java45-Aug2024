package ArrayListEx2;

import java.util.ArrayList;

public class ArrayListOne {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        enames.add("Amith");
        enames.add("DK Shiva");
        //Iterate ArrayList - using for, while and dowhile and forEach, Iterator
        //1 . for loop
        for(int i=0;i<=enames.size()-1;i++){
            System.out.println(enames.get(i));
        }
        //2.while loop
        int i=0;
        while(i<=enames.size()-1){
            System.out.println(enames.get(i));
            i++;
        }
        //do..while
        int index=0;
        do{
            System.out.println(enames.get(index));
            index++;
        }while(i<=enames.size()-1);
        //for Each
        for (String ename:enames) {
            System.out.println(ename);
        }

    }
}
