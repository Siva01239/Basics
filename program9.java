import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String inputString = scan.nextLine();
        if (inputString.contains("Java")) {
            System.out.println("The string contains Java.");
        } else {
            System.out.println("The string does not contain Java.");
        }
        scan.close();
    }
}
