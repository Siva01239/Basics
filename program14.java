package basic;
import java.util.Scanner;
public class program14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scan.nextLine();
        String cleanedString = inputString.replaceAll("\\s+", "").toLowerCase();
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        if (cleanedString.equals(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
