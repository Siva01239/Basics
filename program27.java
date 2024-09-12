package basic;
import java.util.Scanner;
public class program27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int minLength = Integer.MAX_VALUE;
        int currentLength = 1;
        int startIndex = -1;
        int tempStartIndex = 0;
        for (int i = 1; i < n; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > 1 && currentLength < minLength) {
                    minLength = currentLength;
                    startIndex = tempStartIndex;
                }
                currentLength = 1;
                tempStartIndex = i;
            }
        }
        if (currentLength > 1 && currentLength < minLength) {
            minLength = currentLength;
            startIndex = tempStartIndex;
        }
        if (startIndex != -1) {
            System.out.println("The smallest increasing sub-array is:");
            for (int i = startIndex; i < startIndex + minLength; i++) {
                System.out.print(numbers[i] + " ");
            }
        } else {
            System.out.println("No increasing sub-array found.");
        }
    }
}
