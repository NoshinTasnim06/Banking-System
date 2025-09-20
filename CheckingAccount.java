package Banking_Project;

public class CheckingAccount {

    // attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // constructors
    // no default constructors

    public CheckingAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public CheckingAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CheckingAccount [accountHolder=");
        builder.append(accountHolder);
        builder.append(", accountNumber=");
        builder.append(accountNumber);
        builder.append(", balance=");
        builder.append(balance);
        builder.append("]");
        return builder.toString();
    }

    // getters and setters
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // banking methods
    public String deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            return amount + "$ deposited into account: " + this.getAccountNumber()
                   + ". Balance: " + this.balance;
        } else {
            return "Invalid deposit amount.";
        }
    }

    public String withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance = this.balance - amount;
            return amount + "$ withdrawn from account: " + this.getAccountNumber()
                   + ". Balance: " + this.balance;
        } else {
            return "Insufficient funds or invalid withdrawal.";
        }
    }

    public String checkBalance() {
        return "Account " + this.getAccountNumber() + " Balance: $" + this.balance;
    }
}
