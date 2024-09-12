package basic;

import java.util.Arrays;
import java.util.Scanner;

public class program22 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
            int[] oddPositionElements = new int[(n + 1) / 2];
            int[] evenPositionElements = new int[n / 2];
            int oddIndex = 0, evenIndex = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    oddPositionElements[oddIndex++] = numbers[i];
                } else {
                    evenPositionElements[evenIndex++] = numbers[i];
                }
            }
            Arrays.sort(oddPositionElements);
            reverseArray(oddPositionElements);
            Arrays.sort(evenPositionElements);
            oddIndex = 0;
            evenIndex = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    numbers[i] = oddPositionElements[oddIndex++];
                } else {
                    numbers[i] = evenPositionElements[evenIndex++];
                }
            }
            System.out.println("Sorted array with odd positions in descending order and even positions in ascending order:");
            System.out.println(Arrays.toString(numbers));
        }
        private static void reverseArray(int[] array) {
            int start = 0;
            int end = array.length - 1;
            while (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
}
