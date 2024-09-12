package basic;
import java.util.Scanner;
public class program23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the character you want to remove: ");
        char charToRemove = scanner.next().charAt(0);
        String resultString = inputString.replace(Character.toString(charToRemove), "");
        System.out.println(resultString);
    }
}
