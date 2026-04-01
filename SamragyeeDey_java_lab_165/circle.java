import java.util.Scanner;


class Point {
    int x, y;

    void input(Scanner sc) {
        System.out.print("Enter x coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        y = sc.nextInt();
    }

    void display() {
        System.out.print("(" + x + ", " + y + ")");
    }
}


class Circle {
    double radius;
    Point center;  

    void input(Scanner sc) {
        center = new Point();
        center.input(sc);

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    void display() {
        System.out.print("Center of Circle: ");
        center.display();
        System.out.println("\nRadius: " + radius);

        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}


public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        c.input(sc);
        c.display();

        sc.close();
    }
}
