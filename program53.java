package basic;
import java.util.HashSet;
import java.util.Set;
public class program53 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        Set<Integer> common = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }
        System.out.println("Common elements: " + common);
    }
}
