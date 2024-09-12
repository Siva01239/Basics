package basic;

import java.util.Scanner;
public class program26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int maxLength = 1;
        int currentLength = 1;
        int startIndex = 0;
        int tempStartIndex = 0;
        for (int i = 1; i < n; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = tempStartIndex;
                }
                currentLength = 1;
                tempStartIndex = i;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
            startIndex = tempStartIndex;
        }
        System.out.println("The longest increasing sub-array is:");
        for (int i = startIndex; i < startIndex + maxLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
