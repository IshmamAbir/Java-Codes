import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String args[])

    {
        DecimalFormat decimalFormat=new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(Math.random()*100));


        Scanner sc=new Scanner(System.in);
        System.out.print("Input low Value: ");
        int low=sc.nextInt();
        System.out.print("Insert high value : ");
        int high=sc.nextInt();

        ArrayList<Integer> list=new ArrayList<>();
        for (int i=low;i<=high;i++){
            list.add(i);
        }

        list.stream().filter((i) -> i%2==0).forEach((i)->{
            System.out.println("even:"+i);
        });
        list.stream().filter((i) -> i%2!=0).forEach((i)->{
            System.out.println("odd:"+i);
        });


    }
}