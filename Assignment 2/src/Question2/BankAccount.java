package Question2;

public class BankAccount {

    private String branch;
    private String BankName;
    private String Account_type;
    private String account_number;
    private double current_balance=0;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getAccount_type() {
        return Account_type;
    }

    public void setAccount_type(String account_type) {
        Account_type = account_type;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getCurrent_balance() {
        return current_balance;
    }

    public void setCurrent_balance(double current_balance) {
        this.current_balance = current_balance;
    }

    public BankAccount(String bankName, String branch, String account_type, String account_number) {
        setBankName(bankName);
        setBranch(branch);
        setAccount_number(account_number);
        setAccount_type(account_type);
    }

    public void addSalary(double amount){
        current_balance+=amount;
    }
}
