package Banking_Project;

public class Transaction {
    
    // attributes
    private String type;       // "deposit" or "withdraw"
    private double amount;
    private double balanceAfter;

    // constructor
    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Transaction [type=");
        builder.append(type);
        builder.append(", amount=");
        builder.append(amount);
        builder.append(", balanceAfter=");
        builder.append(balanceAfter);
        builder.append("]");
        return builder.toString();
    }

    // getters
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }
}
