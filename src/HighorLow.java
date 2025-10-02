import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int targetNum = 0;
        int userGuess = 0;
        int guessNum = 0;
        boolean done = false;
        String trash = "";

        targetNum = rand.nextInt(10) + 1;

        do
        {
            System.out.print("Enter a guess between 1 and 10: ");
            if (in.hasNextInt())
            {
                guessNum = in.nextInt();
                in.nextLine();
                if (guessNum < 1 || guessNum > 10)
                {
                    System.out.println("Your guess must be between 1 and 10. Please try again.");
                }
                else if (guessNum < targetNum)
                {
                    System.out.println("Your guess is too low. Please try again.");
                }
                else if (guessNum > targetNum)
                {
                    System.out.println("Your guess is too high. Please try again.");
                }
                else
                {
                    System.out.println("Congratulations! You guessed the number!");
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please try again.");
            }
        }while (!done);
    }
}
