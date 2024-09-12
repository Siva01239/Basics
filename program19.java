import java.util.Scanner;
import java.util.Arrays;
public class program19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        if (n < 3) {
            System.out.println(a[0] - 1);
        } else {
            System.out.println(a[n - 3]);

        }
    }
}
