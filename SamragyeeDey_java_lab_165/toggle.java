import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } 
            else if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } 
            else {
                result += ch;
            }
        }

        System.out.println("Converted string: " + result);

        sc.close();
    }
}
