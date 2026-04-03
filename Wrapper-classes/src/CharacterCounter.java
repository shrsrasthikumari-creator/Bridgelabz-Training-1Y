import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int letters = 0;
        int digits = 0;
        int specialChars = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isWhitespace(ch)) {
                // If it's not a letter, digit, or whitespace, it's a special character
                specialChars++;
            }
        }

        System.out.println("\n--- Analysis Results ---");
        System.out.println("Total Letters: " + letters);
        System.out.println("Total Digits: " + digits);
        System.out.println("Total Special Characters: " + specialChars);

        scanner.close();
    }
}
