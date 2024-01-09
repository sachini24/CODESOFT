import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int random = 38;
        Scanner sun = new Scanner(System.in);
        System.out.print("---Guess the number--\nYou have 5 chances to guess the " +
                "number. Number belongs to integer and range 1 - 100. \n");

        System.out.print("This is your 1st chance." +
                " Enter the number: ");
        int num = sun.nextInt();

        int score = 100;
        boolean found = false;

        for (int i = 1; i <= 5; i++) {
            if (num == random) {
                found = true;
                if (i == 5) {
                    score = 20;
                }
                break;
            } else {
                if (i == 5) {
                    System.out.println("Your answer is wrong. Your all chances are finished.");
                    break;
                }
                System.out.println("Your answer is wrong.");
                if (num > random)
                    System.out.println("Your number is greater than the right number.\n");
                else
                    System.out.println("Your number is less than the right number.\n");

                System.out.print("This is your " + (i + 1) + " chance." +
                        " Enter the number: ");
                num = sun.nextInt();
                score -= 20;
            }
        }

        if (found) {
            System.out.println("Congratulations... Your answer is correct.");
            System.out.println("Your score: " + score);
        } else {
            System.out.println("Your Score: " + 0);
        }
    }
}
