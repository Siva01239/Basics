package basic;

public class program59 {
    public static boolean isPrime(int num, int divisor) {
        if (num < 2) return false;
        if (divisor == 1) return true;
        if (num % divisor == 0) return false;
        return isPrime(num, divisor - 1);
    }
    public static void main(String[] args) {
        int num = 29;
        boolean result = isPrime(num, num / 2);
        if (result)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
