import java.util.Scanner;
import java.util.Random;

public class guessingnumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int lowerBound = 1;
    int upperBound = 100;
    int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

    int attempts = 0;
    int maxAttempts = 10; // You can adjust this value

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");

    while (attempts < maxAttempts) {
      System.out.print("Enter your guess: ");
      int userGuess = scanner.nextInt();
      attempts++;

      if (userGuess == targetNumber) {
        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
        break;
      } else if (userGuess < targetNumber) {
        System.out.println("Your guess is too low. Try again.");
      } else {
        System.out.println("Your guess is too high. Try again.");
      }
    }

    if (attempts >= maxAttempts) {
      System.out.println(
          "Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + ".");
    }

    scanner.close();
  }
}
