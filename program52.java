import java.util.Arrays;
public class program52 {
    public static void rotate(int[] arr, int positions) {
        int n = arr.length;
        positions = positions % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, positions - 1);
        reverse(arr, positions, n - 1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int positions = 2;
        rotate(arr, positions);
        System.out.println("Array after rotating by " + positions + " positions: " + Arrays.toString(arr));
    }
}
