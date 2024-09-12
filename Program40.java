package basic;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Program40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                scanner.close();
                return;
            }
        }
        System.out.println("No non-repeated character found.");
        scanner.close();
    }
}
