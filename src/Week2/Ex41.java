package Week2;
import java.util.Scanner;


public class Ex41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = drawNumber();
        int guesses = 0;

        while (true) {
            System.out.print("Guess a number: ");
            int guess = Integer.valueOf(scanner.nextLine());

            guesses++;

            if (guess < number) {
                System.out.println("The number is greater, guesses made: " + guesses);
            } else if (guess > number) {
                System.out.println("The number is lesser, guesses made: " + guesses);
            } else {
                System.out.println("Congratulations, your guess is correct! Guesses made: " + guesses);
                break;
            }
        }
    }

    public static int drawNumber() {
        return (int) (Math.random() * 101);
    }
}
