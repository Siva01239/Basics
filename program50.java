import java.util.Arrays;
public class program50 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
