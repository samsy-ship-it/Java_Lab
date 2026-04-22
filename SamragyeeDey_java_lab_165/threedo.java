import java.util.Scanner;


abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}


class Box extends ThreeDObject {
    double length, breadth, height;

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double wholeSurfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    double volume() {
        return length * breadth * height;
    }
}


class Cube extends ThreeDObject {
    double side;

    Cube(double s) {
        side = s;
    }

    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}


class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}


class Cone extends ThreeDObject {
    double radius, height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + l);
    }

    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj; 

       
        System.out.println("Enter length, breadth and height of Box:");
        obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Box Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Box Volume: " + obj.volume());

        
        System.out.println("\nEnter side of Cube:");
        obj = new Cube(sc.nextDouble());
        System.out.println("Cube Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Cube Volume: " + obj.volume());

       
        System.out.println("\nEnter radius and height of Cylinder:");
        obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cylinder Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + obj.volume());

       
        System.out.println("\nEnter radius and height of Cone:");
        obj = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cone Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Cone Volume: " + obj.volume());

        sc.close();
    }
}
