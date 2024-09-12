package basic;
import java.util.Scanner;
public class program18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scan.nextLine();
        String lowerCaseString = inputString.toLowerCase();
        boolean hasVowel = false;
        for (int i = 0; i < lowerCaseString.length(); i++) {
            char ch = lowerCaseString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                hasVowel = true;
                break;
            }
        }
        if (hasVowel) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
