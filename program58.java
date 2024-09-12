package basic;

public class program58 {
    public static void main(String[] args) {
        int limit = 10;
        int first = 0, second = 1;
        System.out.println("Fibonacci sequence up to " + limit + " terms:");
        for (int i = 1; i <= limit; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
