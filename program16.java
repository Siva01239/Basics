package basic;
import java.util.Arrays;
import java.util.Scanner;
public class program16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many names do you want to enter? ");
        int count = scan.nextInt();
        scan.nextLine();
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scan.nextLine();
        }
        Arrays.sort(names);
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}