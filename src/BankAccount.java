public class BankAccount {
    private long accountNumber;
    private double amount;
    private char accountype;
    private int lim;
    private int cantidad;

    public BankAccount(long accountNumber, char accountype) {
        this.accountype = accountype;
        switch (this.accountype) {
            case 'A':
                lim = 50000;
                cantidad = 1000;
                this.accountNumber = accountNumber;
                break;
            case 'B':
                lim = 10000;
                cantidad = 5000;
                this.accountNumber = accountNumber;

                break;
            case 'C':
                cantidad = 10000;
                this.accountNumber = accountNumber;
                break;

            default:
                break;
        }

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public char getAccountype() {
        return accountype;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    protected void plusMoneyB(double money) {

        if (lim == 0 || (amount + money) < lim) {
            amount = amount + money;
        } else {
            System.out.println("No puede agregarse más dinero a la cuenta");
        }
    }

    protected void minusMoneyb(double money) {
        if (money < amount && money >= cantidad) {
            amount = amount - money;
        } else {
            System.out.println("No se puede retirar el dinero");
        }
    }
}