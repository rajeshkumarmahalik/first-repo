import java.util.Random;
import java.util.Scanner;

public class NumberGuessing{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int targetNumber = rand.nextInt(100) + 1;

        int userGuess;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

            while (true) {
                userGuess = scanner.nextInt();

                if (userGuess== targetNumber) {
                    System.out.println(" Congratulations! You guessed the number " + targetNumber);
                    break;
                } else if (userGuess< targetNumber) {
                    System.out.println("Your guess is too low. Try again:");
                } else {
                    System.out.println("Your guess is too high. Try again:");
                }
            }
    }
}
