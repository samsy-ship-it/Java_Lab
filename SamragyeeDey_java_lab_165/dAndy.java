import java.util.Scanner;

public class ReplaceCharManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'd') {
                newStr += 'f';
            } else {
                newStr += ch;
            }
        }

        System.out.println("Updated string: " + newStr);

        sc.close();
    }
}
