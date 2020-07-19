package Question2;

import java.util.Scanner;

public class SalaryManager {
    private static double companyBalance;
    private static double basicSalary;
    private final int SALARY_DIFFERENCE = 5000;
    final byte LOWEST_RANK=6;
    private Employee[] employees=new Employee[10];
    private static double disburseSalary=0;

    public static void setCompanyBalance(double companyBalance) {
        SalaryManager.companyBalance = companyBalance;
    }

    public static void setBasicSalary(double basicSalary) {
        SalaryManager.basicSalary = basicSalary;
    }

    public void checkAndFillBalance(double salary){
        if (companyBalance - salary >= 0)
            return;

        System.out.println("Insufficient Balance.fill ur Balance. Enter Amount");
        Scanner sc=new Scanner(System.in);
        double addedBalance=sc.nextDouble();
        companyBalance +=addedBalance;
        checkAndFillBalance(salary); 
    }


    void disburseSalary(){
        for (Employee employee:employees){
            double salary = calculaeTotalsalary(employee.rank);
            checkAndFillBalance(salary);
            employee.salary = salary;
            employee.bankAccount.addSalary(salary);
            companyBalance-=salary;
            disburseSalary+=salary;
        }
    }

    void printSalarySummary(){
        System.out.println("Total paid Salary="+disburseSalary);
        System.out.println("Current COmpany Balance="+companyBalance);
    }

    void printEmployeeInfo(){
        for (Employee employee:employees){
            System.out.println("Employee Name="+employee.employeeName);
            System.out.println("Employee Account="+employee.bankAccount);
            System.out.println("Employee Rank="+employee.rank);
            System.out.println("Employee Salary="+employee.salary);
            System.out.println("\n");
        }
    }



    {

        Employee employee1=new Employee("Abir","ctg", (byte) 1,new BankAccount("abc","adsa","saving","453345"));
        Employee employee2=new Employee("Ar","tg", (byte) 1,new BankAccount("abc","adsa","saving","1453345"));
        Employee employee3=new Employee("bir","cg", (byte) 2,new BankAccount("abc","adsa","saving","8453345"));
        Employee employee4=new Employee("Air","ct", (byte) 2,new BankAccount("abc","adsa","saving","7453345"));
        Employee employee5=new Employee("Abi","c", (byte) 3,new BankAccount("abc","adsa","saving","3453345"));
        Employee employee6=new Employee("ir","g", (byte) 3,new BankAccount("abc","adsa","saving","67453345"));
        Employee employee7=new Employee("Ab","t", (byte) 4,new BankAccount("abc","adsa","saving","4753345"));
        Employee employee8=new Employee("Abr","ctdg", (byte) 4,new BankAccount("abc","adsa","saving","043345"));
        Employee employee9=new Employee("Aghbirfg","sdfgctg", (byte) 5,new BankAccount("abc","adsa","saving","53345"));
        Employee employee10=new Employee("dfgAbir","cdtg", (byte) 6,new BankAccount("abc","adsa","saving","3345"));

        employees[0]=employee1;
        employees[1]=employee2;
        employees[2]=employee3;
        employees[3]=employee4;
        employees[4]=employee5;
        employees[5]=employee6;
        employees[6]=employee7;
        employees[7]=employee8;
        employees[8]=employee9;
        employees[9]=employee10;

    }



    public double calculaeTotalsalary(byte rank){
        double baseSalary= (this.LOWEST_RANK - rank)*SALARY_DIFFERENCE + basicSalary;
        double allowance=calculateAllowance(baseSalary);
        return baseSalary+allowance;
    }
    public double calculateAllowance(double basSalary){
        double homeAl= basSalary* 0.20 ;
        double medicalAl = basSalary * 0.15;
        return  homeAl + medicalAl ;
    }



}

