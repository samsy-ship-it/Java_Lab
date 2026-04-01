import java.util.Scanner;

class Item {
    int code;
    double price;

    
    void input(Scanner sc) {
        System.out.print("Enter Item Code: ");
        code = sc.nextInt();
        System.out.print("Enter Item Price: ");
        price = sc.nextDouble();
    }

    
    void display() {
        System.out.println(code + "\t\t" + price);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];
        double total = 0;

        
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            System.out.println("\nEnter details for Item " + (i + 1));
            items[i].input(sc);
            total += items[i].price;
        }

        
        System.out.println("\nCode\t\tPrice");
        System.out.println("-----------------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
        }

        
        System.out.println("-----------------------");
        System.out.println("Total Price = " + total);

        sc.close();
    }
}
