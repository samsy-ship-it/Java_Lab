class Student {
    String name;
    int age;

    
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    
    Student(String n) {
        name = n;
        age = 0;
        System.out.println("Constructor with 1 parameter Called");
    }

    
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Constructor with 2 parameters Called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {

        
        Student s1 = new Student();
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Anjali", 20);

        
        s1.display();
        s2.display();
        s3.display();
    }
}