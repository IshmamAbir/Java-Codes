package ExaptionHandling;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int z;
        boolean c=true;

        while (c==true) {
            Scanner sc= new Scanner(System.in);

            try {

                int x=sc.nextInt();
                int y=sc.nextInt();
                z = x / y;
                System.out.println(z);
                c=false;


            } /*catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("Exception " + e1);
            } */catch (Exception e2) {
                System.out.println("Exception2 " + e2);
                System.out.println("Invalid. type again");

            }
        }
    }
}
