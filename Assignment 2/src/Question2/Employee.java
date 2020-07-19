package Question2;

public class Employee {

    String employeeName;
    byte rank;
    String address;
    String mobileNmbr;
    BankAccount bankAccount;
    double salary;
    private double totalSalary;


    public Employee(String name,String address,byte rank,BankAccount bankAccont ){
        employeeName=name;
        this.address =address;
        this.rank=rank;
        this.bankAccount=bankAccont;


    }






}
