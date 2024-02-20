import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        boolean hasGuessed = false;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        while (!hasGuessed) {
            try {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
                    System.out.println("It took you " + attempts + " attempts.");
                    hasGuessed = true;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the input buffer
            }
        }

        scanner.close();
    }
}
