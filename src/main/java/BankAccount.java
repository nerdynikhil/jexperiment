public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean isActive=true;
    private String holderName;

    public BankAccount(double balance, double minimumBalance){
        this.balance=balance;
        this.minimumBalance=minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) {
        if(balance - amount > minimumBalance){
            balance -= amount;
            return amount;
        }
        else{
            throw new RuntimeException();
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

}
