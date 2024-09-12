package basic;
import java.util.Scanner;
public class program31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        String[] words = new String[n];
        System.out.println("Enter " + n + " strings:");
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        System.out.println("Array elements in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
