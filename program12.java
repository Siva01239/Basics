package basic;
import java.util.Scanner;
public class program12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scan.nextLine();
        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);
        scan.close();
    }
}
