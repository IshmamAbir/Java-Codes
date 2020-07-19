package com.company;

public class BankAccount {
    private String bankName;
    private String branchName;
    private int acoountNumber;
    private String accountType;

    public BankAccount(String bankName, String branchName, int acoountNumber, String accountType) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.acoountNumber = acoountNumber;
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return
                "bankName='" + bankName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", acoountNumber=" + acoountNumber +
                ", accountType='" + accountType + '\'' ;
    }
}
