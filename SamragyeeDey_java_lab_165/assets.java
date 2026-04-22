abstract class Asset {
    String descriptor;
    String date;
    double current_value;

    Asset(String descriptor, String date, double current_value) {
        this.descriptor = descriptor;
        this.date = date;
        this.current_value = current_value;
    }

    abstract void displayDetails();
}

class Stock extends Asset {
    int num_shares;
    double share_price;

    Stock(String descriptor, String date, double current_value, int num_shares, double share_price) {
        super(descriptor, date, current_value);
        this.num_shares = num_shares;
        this.share_price = share_price;
    }

    void displayDetails() {
        System.out.println("STOCK DETAILS");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Number of Shares: " + num_shares);
        System.out.println("Share Price: " + share_price);
    }
}

class Bond extends Asset {
    double interest_rate;

    Bond(String descriptor, String date, double current_value, double interest_rate) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
    }

    void displayDetails() {
        System.out.println("\nBOND DETAILS");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate);
    }
}

class Savings extends Asset {
    double interest_rate;

    Savings(String descriptor, String date, double current_value, double interest_rate) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
    }

    void displayDetails() {
        System.out.println("\nSAVINGS DETAILS");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate);
    }
}

public class Main {
    public static void main(String[] args) {

        Asset a;

        a = new Stock("Tech Stock", "01-04-2026", 50000, 100, 500);
        a.displayDetails();

        a = new Bond("Government Bond", "15-03-2026", 30000, 7.5);
        a.displayDetails();

        a = new Savings("Savings Account", "10-02-2026", 20000, 4.0);
        a.displayDetails();
    }
}
