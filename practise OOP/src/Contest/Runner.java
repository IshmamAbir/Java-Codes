package Contest;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1input=sc.nextLine();
        String name2input=sc.nextLine();
        String name1,name2;
        int name1sum=0,name2sum=0,add1,add2;
        if (name1input.length() == name2input.length() && name1input.length()<=100){
            name1=name1input.toLowerCase();
            name2=name2input.toLowerCase();

            int length= name1.length();

            for (int i=0;i<length;i++){
                add1=name1.charAt(i);
                add2=name2.charAt(i);

                name1sum+=add1;
                name2sum+=add2;
            }

            if (name1sum<name2sum)
                System.out.println("-1");
            else if (name1sum>name2sum)
                System.out.println("1");
            else
                System.out.println("0");


        }








       /* int upper=0,lower=0;
        String conv;

        for (int i=0;i<name.length();i++){
            int convert = name.charAt(i);

            if ( convert<=90){
                upper++;
            }
            else
                lower++;
        }
        if (upper<=lower){
            conv=name.toLowerCase();
        }
        else
            conv=name.toUpperCase();


        System.out.println(conv);*/
    }
}
