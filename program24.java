import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class program24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Set<Integer> distinctNumbers = new HashSet<>();
        for (int num : numbers) {
            distinctNumbers.add(num);
        }
        System.out.println("Distinct numbers in the array are:");
        for (int num : distinctNumbers) {
            System.out.println(num);
        }
    }
}
