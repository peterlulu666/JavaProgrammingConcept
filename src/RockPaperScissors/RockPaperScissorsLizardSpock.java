package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsLizardSpock {
    public static void main(String[] args) {
        // The first step is to ask the Human Player what
        // they choose and then repeat back their choice.
        // Players will enter either R for Rock, P for Paper,
        // and S for Scissors.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome one and all to a round of Rock, " +
                "Paper, Scissors, Spock, Lizard! (Enter R, P, S, K or L)");
        System.out.print("Player: ");
        String str = scanner.nextLine();
        // Wonderful, almost done! Since we are good little programmers,
        // we know that our user may not always follow instructions
        // exactly as we state. We want to handle the situation
        // when the user accidently types a lower case letter.
        // Now the Human Player can enter either R or r for rock, P or p for
        // paper, and S or s for scissors.
        char choose = Character.toUpperCase(str.charAt(0));
        int playerChoose = 0;
        String playerStr = "";
        switch (choose) {
//            case 'P' -> System.out.println("Player choose " + choose);
//            case 'R' -> System.out.println("Player choose " + choose);
//            case 'S' -> System.out.println("Player choose " + choose);
//            default -> System.out.println("Enter P, R or S");
            // This could work, but it is somewhat cryptic.
            // Will S beat 1? We don't know. We need to convert both
            // players' choices into intelligble output.
            // We'll start with the Human player first.
            // Instead of printing back whatever the Human entered,
            // we want to convert the single letter entered into the
            // full word that it corresponds to.
            case 'R' -> {
                System.out.println("Player choose Rock");
                playerChoose = 0;
                playerStr = "Rock";

            }
            case 'P' -> {
                System.out.println("Player choose Paper");
                playerChoose = 1;
                playerStr = "Paper";

            }
            case 'S' -> {
                System.out.println("Player choose Scissors");
                playerChoose = 2;
                playerStr = "Scissors";

            }
            case 'K' -> {
                System.out.println("Player choose Spock");
                playerChoose = 3;
                playerStr = "Spock";

            }
            case 'L' -> {
                System.out.println("Player choose Lizard");
                playerChoose = 4;
                playerStr = "Lizard";

            }
            default -> System.out.println("Enter R, P, S, K or L");

        }
        // Now, we must randomly decide what the Computer chooses.
        // To do so, we will randomly generate a number for the computer.
        // The computer has three possible choices and we will represent
        // these three choices by the numbers 0, 1, and 2.
        var random = new Random();
        int computerChoose = random.nextInt(5);
//        System.out.println("Computer choose " + computerChoose);
        // Great! We're one third of the way there.
        // Next, we'll decode what the Computer Player is doing.
        // Instead of displaying 0, 1, or 2,
        // your program should instead print
        // Rock, Paper, or Scissors respectively.
        // At this point, we now will know what each player has thrown.
        String computerStr = "";
        switch (computerChoose) {
            case 0 -> {
                System.out.println("Computer choose Rock");
                computerStr = "Rock";

            }
            case 1 -> {
                System.out.println("Computer choose Paper");
                computerStr = "Paper";

            }
            case 2 -> {
                System.out.println("Computer choose Scissors");
                computerStr = "Scissors";

            }
            case 3 -> {
                System.out.println("Computer choose Spock");
                computerStr = "Spock";

            }
            case 4 -> {
                System.out.println("Computer choose Lizard");
                computerStr = "Lizard";

            }

        }
        // Where X and Y are one of "rock" or "scissors" or "paper" and Z is either "Human" or "Computer".
        // Be sure to handle ties appropriately too. And now, we have a fully functioning Rock,
        // Paper, Scissors game! Great job!
        if (playerChoose - computerChoose == 0) {
            System.out.println("Tie!");

        } else if (playerChoose - computerChoose == -3 ||
                playerChoose - computerChoose == -1 ||
                playerChoose - computerChoose == 2 ||
                playerChoose - computerChoose == 4) {
            System.out.println(computerStr + " beats " + playerStr);
            System.out.println("Computer wins!");

        } else {
            System.out.println(playerStr + " beats " + computerStr);
            System.out.println("Player wins!");

        }

    }
}
