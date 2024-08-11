import java.util.Scanner;

// Custom exception class
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

public class BankAccount {
     int bal;

    public BankAccount(int initialBal) {
        this.bal = initialBal;
    }

    public void deposit(int amount) {
        bal += amount;
    }

    public void withdraw(int amount) {
        try {
            if (amount > bal) {
                throw new LowBalanceException("Withdrawal amount exceeds current balance.");
            }
            bal -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + bal);
        } 
        catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getBalance() {
        return bal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(1000); // Initial balance of 1000

        System.out.println("Enter amount to withdraw: ");
        int amt = sc.nextInt();

        // The try-catch block is handled within the withdraw method.
        acc.withdraw(amt);

        sc.close();
    }
}
