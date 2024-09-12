import java.util.Scanner;
public class program25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the element you want to find: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("-1 ");
        }
    }
}
