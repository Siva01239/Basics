package basic;
import java.util.HashSet;
import java.util.Scanner;
public class Program34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int maxLength = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();
        for (int end = 0; end < input.length(); end++) {
            while (set.contains(input.charAt(end))) {
                set.remove(input.charAt(start));
                start++;
            }
            set.add(input.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println("Length of the longest substring without repeating characters: " + maxLength);
        scanner.close();
    }
}
