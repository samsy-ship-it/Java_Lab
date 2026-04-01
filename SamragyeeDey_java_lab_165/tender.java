import java.util.Scanner;

class Tender {
    double cost;
    String company;

    
    void input(Scanner sc) {
        System.out.print("Enter Company Name: ");
        company = sc.next();
        System.out.print("Enter Cost: ");
        cost = sc.nextDouble();
    }
}

public class TenderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] t = new Tender[5];

      
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("\nEnter details for Tender " + (i + 1));
            t[i].input(sc);
        }

        
        double minCost = t[0].cost;
        String minCompany = t[0].company;

        
        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].company;
            }
        }

        
        System.out.println("\nCompany with Minimum Cost: " + minCompany);
        System.out.println("Minimum Cost: " + minCost);

        sc.close();
    }
}
