package Assignment;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter bank Balance");
        double bankBalance=sc.nextDouble();
        System.out.println("Enter lowest grade basic salary");
        double lowestBasic=sc.nextDouble();

        SalaryManager.setBasicSalary(lowestBasic);
        SalaryManager.setCompanyBalance(bankBalance);

        SalaryManager salaryManager=new SalaryManager();
        salaryManager.disburseSalary();
        System.out.println("\n");
        System.out.println("\n");
        salaryManager.printSalarySummary();
        System.out.println("\n");
        System.out.println("\n");
        salaryManager.printEmployeeInfo();

    }
}
