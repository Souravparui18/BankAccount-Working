import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double intialBalance) {
        this.balance = intialBalance;

    }

    public void deposits(Double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("balance " + amount);
        } else {
            System.out.println("invalid deposit amount!");
        }
        displayBalance();
    }

    public void withdraw(Double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! withdraw failed");
        } else {
            balance -= amount;
            System.out.println("Withdraw " + amount);

        }
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("your current balance is " + balance);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(5000);

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3 Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your deposit amount: ");
                    double dep = sc.nextDouble();
                    acc.deposits(dep);
                    break;

                case 2:
                    System.out.println("Enter Withdraw amount: ");
                    double wit = sc.nextDouble();
                    acc.withdraw(wit);
                    break;

                case 3:
                    System.out.println("Thank you for using our service!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again!.");
            }


        }
    }
}