abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;

    Accounts(int accNo, String name, String addr, double bal) {
        accountNumber = accNo;
        accountHoldersName = name;
        address = addr;
        balance = bal;
    }

    abstract void withdrawal(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(int accNo, String name, String addr, double bal, double roi) {
        super(accNo, name, addr, bal);
        rateOfInterest = roi;
    }

    void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful!");
    }

    void calculateAmount() {
        double interest = (balance * rateOfInterest) / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

public class Main {
    public static void main(String[] args) {
        Accounts acc = new SavingsAccount(101, "Rahul", "Kolkata", 10000, 5);

        acc.display();

        acc.deposit(2000);
        acc.display();

        acc.withdrawal(3000);
        acc.display();

        SavingsAccount sa = (SavingsAccount) acc;
        sa.calculateAmount();
        acc.display();
    }
}
