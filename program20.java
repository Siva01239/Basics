import java.util.Scanner;
public class program20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scan.nextLine();
        String cleanedString = inputString.replaceAll("\\s+", "").toLowerCase();
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        if (cleanedString.equals(reversedString)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
