import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a new rock paper scissors game
        RockPaperScissors game = new RockPaperScissors();

        // play the game
        while (!game.isOver()) {
            // display the current score
            System.out.println("Score: You " + game.getPlayerScore() + " - Computer " + game.getComputerScore());

            // get the player's move
            String playerMove = getMoveFromPlayer();

            // make the moves
            game.move(playerMove);
        }

        // display the final score
        System.out.println("Final Score: You " + game.getPlayerScore() + " - Computer " + game.getComputerScore());

        // print the game result
        if (game.getPlayerScore() > game.getComputerScore()) {
            System.out.println("You won!");
        } else if (game.getPlayerScore() < game.getComputerScore()) {
            System.out.println("You lost.");
        } else {
            System.out.println("It's a draw.");
        }
    }

    // gets the player's move
    private static String getMoveFromPlayer() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your move (rock, paper, or scissors): ");
            String move = scanner.nextLine().toLowerCase();
            if (move.equals("rock") || move.equals("paper") || move.equals("scissors")) {
                return move;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
}

