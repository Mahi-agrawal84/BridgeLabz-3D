package AccessModifiers;

public class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Ravi Kumar", 5000);
        acc1.displayAccountDetails();
        acc1.deposit(2000);
        acc1.displayAccountDetails();
        acc1.withdraw(8000);
        acc1.withdraw(3000);
        acc1.displayAccountDetails();

        SavingsAccount sa = new SavingsAccount(2001, "Anita Sharma", 10000, 5.5);
        sa.displaySavingsDetails();
    }
}
