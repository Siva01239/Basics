import java.util.Scanner;
public class Program35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] words = input.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}
