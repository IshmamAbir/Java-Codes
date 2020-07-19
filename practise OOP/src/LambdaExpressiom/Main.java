package LambdaExpressiom;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myInt=new ArrayList<Integer>();
        myInt.addAll(Arrays.asList(new Integer[]{
                2,4,1,5,6,7,8,3,9,90
        }));

        myInt.stream()
                .sorted((a,b)->{
                    return Integer.compare(b,a);
                })
               /* .filter(i -> {
                    return i<6 ? true:false;
                })*/
                .forEach((i)->{
                    System.out.println(i);
        });
    }
}
