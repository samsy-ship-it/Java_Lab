import java.util.Scanner;

interface Gross {
    double calculateGross();
}

class Employee {
    String name;
    int empId;

    void getEmployeeData(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
    }

    void displayEmployeeData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

class Salary extends Employee implements Gross {
    double basic;
    double hra;
    double da;

    void getSalaryData(Scanner sc) {
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();
        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }

    public double calculateGross() {
        return basic + hra + da;
    }

    void displaySalary() {
        displayEmployeeData();
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Salary s = new Salary();

        s.getEmployeeData(sc);
        s.getSalaryData(sc);

        System.out.println("\nEMPLOYEE DETAILS");
        s.displaySalary();

        sc.close();
    }
}
