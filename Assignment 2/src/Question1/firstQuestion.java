package Question1;

import java.util.Scanner;

public class firstQuestion {
    public static void main(String[] args) {
        int date,state;
        Scanner sc= new Scanner(System.in);
        date = sc.nextInt();

        if (date>0 && date<=31){

            state=date%7;

            switch (state){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 0:
                    System.out.println("Saturday");
                    break;

            }

        }
    }
}
