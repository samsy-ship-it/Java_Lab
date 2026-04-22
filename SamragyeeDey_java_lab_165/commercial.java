interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    double lastSaleAmount;
    String lastClient;

    public void processSale(double amount) {
        lastSaleAmount = amount;
        System.out.println("Sale processed successfully.");
        System.out.println("Sale Amount: " + amount);
    }

    public void generateInvoice(String clientName, double amount) {
        lastClient = clientName;
        System.out.println("\nInvoice Generated");
        System.out.println("Client Name: " + clientName);
        System.out.println("Invoice Amount: " + amount);
    }

    void showSummary() {
        System.out.println("\nSUMMARY");
        System.out.println("Last Client: " + lastClient);
        System.out.println("Last Sale Amount: " + lastSaleAmount);
        System.out.println("Commercial operations completed successfully.");
    }
}

public class Main {
    public static void main(String[] args) {

        CommercialExecutive ce = new CommercialExecutive();

        ce.processSale(5000.0);
        ce.generateInvoice("ABC Pvt Ltd", 5000.0);
        ce.showSummary();
    }
}
