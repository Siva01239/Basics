package basic;
import java.util.Arrays;
public class program51 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        Arrays.sort(arr);
        System.out.println("Array in ascending order: " + Arrays.toString(arr));
        Integer[] arrDescending = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrDescending, (a, b) -> b - a);
        System.out.println("Array in descending order: " + Arrays.toString(arrDescending));
    }
}
