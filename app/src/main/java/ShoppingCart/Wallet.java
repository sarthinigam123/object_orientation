package ShoppingCart;

public class Wallet {
    public double balance;

    public Wallet(double initialAmt) {
        this.balance = initialAmt;
    }
    public void creditBalance(double credit) {
        this.balance += credit;
    }
   public void debitBalance(double debit) {
        this.balance -= debit;
    }
   public  boolean checkBalance(double requiredBalance) {
        if(this.balance >= requiredBalance)
            return true;
        return false;
    }
}
