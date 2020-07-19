package com.company;

public class Employee {
    private String employeeName;
    private int employeeRank;
    private String phoneNumber;
    private String address;
    private BankAccount bankAccount;

    public Employee(String employeeName, int employeeRank, String phoneNumber, String address, String bankName, String branchName, int acoountNumber, String accountType) {
        this.employeeName = employeeName;
        this.employeeRank = employeeRank;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankAccount = new BankAccount(bankName,branchName,acoountNumber,accountType);
    }

    @Override
    public String toString() {
        return
                "employeeName='" + employeeName + '\'' +
                ", employeeRank=" + employeeRank +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                 bankAccount ;
    }
}
