package basic;
import java.util.ArrayList;
public class program61 {
    public static void generateSubsets(String input, String current, int index) {
        if (index == input.length()) {
            System.out.println(current);
            return;
        }
        generateSubsets(input, current, index + 1);  // Exclude current character
        generateSubsets(input, current + input.charAt(index), index + 1);  // Include current character
    }
    public static void main(String[] args) {
        String input = "ABC";
        generateSubsets(input, "", 0);
    }
}
