package Banking;

public class BankAccount {

    protected String accId;
    protected double accBalance;

    protected String filename = "src/Banking/users_account.txt";

    public BankAccount(String accId, double accBalance) {
        this.accId = accId;
        this.accBalance = accBalance;
    }

    public BankAccount(String accId) {
        this(accId, 0);
    }

    public BankAccount() {
    }

    public String getAccId() {
        return accId;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public String toString() {
        return accId + "," + accBalance;
    }
}
