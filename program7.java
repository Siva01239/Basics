package basic;
import java.util.Scanner;
import java.util.Random;

public class program7 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        Scanner scan = new Scanner(System.in);
        int userGuess = 0;
        int numberOfGuesses = 0;
        System.out.println("Guess a number between 1 and 10!");
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scan.nextInt();
            numberOfGuesses++;
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
        }
        System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
        System.out.println("It took you " + numberOfGuesses + " guesses.");

        scan.close();
    }
}
