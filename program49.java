import java.util.Arrays;
public class program49 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }
        Arrays.sort(arr);
        int secondLargest = arr[arr.length - 2];
        System.out.println(secondLargest);
    }
}
