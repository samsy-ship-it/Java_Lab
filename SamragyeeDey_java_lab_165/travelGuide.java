import java.util.Scanner;

abstract class AbstractProduct {
    int product_id;
    String name;
    String description;

    AbstractProduct(int id, String name, String desc) {
        this.product_id = id;
        this.name = name;
        this.description = desc;
    }
}

class Product extends AbstractProduct {
    double price;

    Product(int id, String name, String desc, double price) {
        super(id, name, desc);
        this.price = price;
    }
}

class Book extends Product {
    String isbn;
    String author;
    String title;

    Book(int id, String name, String desc, double price, String isbn, String author, String title) {
        super(id, name, desc, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }
}

class TravelGuide extends Book {
    String country;

    TravelGuide(int id, String name, String desc, double price, String isbn, String author, String title, String country) {
        super(id, name, desc, price, isbn, author, title);
        this.country = country;
    }

    void display() {
        System.out.println("TRAVEL GUIDE DETAILS");
        System.out.println("Product ID: " + product_id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Country: " + country);
    }
}

class CompactDisc extends Product {
    String artist;
    String title;

    CompactDisc(int id, String name, String desc, double price, String artist, String title) {
        super(id, name, desc, price);
        this.artist = artist;
        this.title = title;
    }

    void display() {
        System.out.println("\nCD DETAILS");
        System.out.println("Product ID: " + product_id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Travel Guide Details:");
        System.out.print("Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Description: ");
        String desc = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Country: ");
        String country = sc.nextLine();

        TravelGuide tg = new TravelGuide(id, name, desc, price, isbn, author, title, country);

        System.out.println("\nEnter CD Details:");
        System.out.print("Product ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Description: ");
        String desc2 = sc.nextLine();
        System.out.print("Price: ");
        double price2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Artist: ");
        String artist = sc.nextLine();
        System.out.print("Title: ");
        String title2 = sc.nextLine();

        CompactDisc cd = new CompactDisc(id2, name2, desc2, price2, artist, title2);

        System.out.println();
        tg.display();
        cd.display();

        sc.close();
    }
}
