import java.util.Scanner;

public class StringStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int upper = 0, lower = 0, digits = 0, spaces = 0;

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isSpaceChar(ch)) {
                spaces++;
            }
        }

        
        System.out.println("\nUppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);

        sc.close();
    }
}
