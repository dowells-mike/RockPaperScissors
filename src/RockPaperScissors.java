import java.util.Random;

// represents a rock paper scissors game
class RockPaperScissors {
    private int playerScore; // the player's score
    private int computerScore; // the computer's score
    private static final int NUM_ROUNDS = 3; // the number of rounds in the game
    private static final Random RANDOM = new Random(); // a random number generator

    public RockPaperScissors() {
        playerScore = 0;
        computerScore = 0;
    }

    // makes a move in the game
    public void move(String playerMove) {
        String computerMove = getComputerMove();
        System.out.println("You played " + playerMove + ", computer played " + computerMove);

        if (playerMove.equals("rock")) {
            if (computerMove.equals("rock")) {
                // it's a draw
            } else if (computerMove.equals("paper")) {
                computerScore++;
            } else {
                playerScore++;
            }
        } else if (playerMove.equals("paper")) {
            if (computerMove.equals("rock")) {
                playerScore++;
            } else if (computerMove.equals("paper")) {
                // it's a draw
            } else {
                computerScore++;
            }
        } else {
            if (computerMove.equals("rock")) {
                computerScore++;
            } else if (computerMove.equals("paper")) {
                playerScore++;
            } else {
                // it's a draw
            }
        }
    }

    // gets the computer's move
    private String getComputerMove() {
        int move = RANDOM.nextInt(3);
        if (move == 0) {
            return "rock";
        } else if (move == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // checks if the game is over
    public boolean isOver() {
        return playerScore == NUM_ROUNDS || computerScore == NUM_ROUNDS;
    }

    // returns the player's score
    public int getPlayerScore() {
        return playerScore;
    }

    // returns the computer's score
    public int getComputerScore() {
        return computerScore;
    }
}