class Outer {
    int x = 10;

   
    class Inner {
        void display() {
            System.out.println("Value of x from Outer class: " + x);
        }
    }

    public static void main(String[] args) {
        Outer obj = new Outer();          // Create outer class object
        Outer.Inner in = obj.new Inner(); // Create inner class object
        in.display();
    }
}