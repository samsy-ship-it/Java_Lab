import java.util.Scanner;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class Customer {
    String name;
    int customerId;

    void getCustomerData(Scanner sc) {
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter Customer ID: ");
        customerId = sc.nextInt();
        sc.nextLine();
    }

    void displayCustomerData() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

class Account extends Customer implements Bank {
    int accountNumber;
    double balance;

    void getAccountData(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();
    }

    void displayAccountData() {
        displayCustomerData();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account();

        acc.getCustomerData(sc);
        acc.getAccountData(sc);

        acc.displayAccountData();

        System.out.print("\nEnter amount to deposit: ");
        double d = sc.nextDouble();
        acc.deposit(d);

        System.out.print("Enter amount to withdraw: ");
        double w = sc.nextDouble();
        acc.withdraw(w);

        System.out.println("\nUpdated Details:");
        acc.displayAccountData();

        sc.close();
    }
}
