class Student {
    int roll;
    String name;
    double marks;

    Student() {
        roll = 0;
        name = "Not Assigned";
        marks = 0.0;
    }

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    Student(int r, String n, double m) {
        roll = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Samragyee");
        Student s3 = new Student(102, "Riya", 88.5);

        s1.display();
        s2.display();
        s3.display();
    }
}