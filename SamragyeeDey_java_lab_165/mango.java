interface Mango {
    void showSeason();
}

class Winter implements Mango {
    public void showSeason() {
        System.out.println("Mangoes are not available in Winter season.");
    }
}

class Summer implements Mango {
    public void showSeason() {
        System.out.println("Mangoes are available in Summer season.");
    }
}

public class Main {
    public static void main(String[] args) {
        Mango m;

        m = new Winter();
        m.showSeason();

        m = new Summer();
        m.showSeason();
    }
}
