class MethodOverloadingDemo {

    
    void display() {
        System.out.println("Display method with no parameters");
    }

    
    void display(int a) {
        System.out.println("Display method with one parameter: " + a);
    }

    
    void display(int a, int b) {
        System.out.println("Display method with two parameters: " + (a + b));
    }

    
    void display(double a) {
        System.out.println("Display method with double parameter: " + a);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        obj.display();
        obj.display(10);
        obj.display(10, 20);
        obj.display(5.5);
    }
}
