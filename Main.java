import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Generate the numbers
        int number = 1 + (int) (100
                * Math.random());
        // Given K trials
        System.out.println("How many trials do you want:");
        int K = sc.nextInt();
        int i, guess;
        System.out.println(
                "A number is chosen"
                        + " between 1 to 100."
                        + "Guess the number"
                        + " within "+K+" trials.");
        // Iterate over K Trials
        for (i = 0; i < K; i++) {
            System.out.println(
                    "Guess the number:");
            // Take input for guessing
            guess = sc.nextInt();
            // If the number is guessed
            if (number == guess) {
                System.out.println(
                        "Congratulations!"
                                + " You guessed the number.");
                break;
            } else if (number > guess
                    && i != K - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            } else if (number < guess
                    && i != K - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }
        if (i == K) {
            System.out.println(
                    "You have exhausted"
                            + " K trials.");

            System.out.println(
                    "The number was " + number);
        }
    }
}