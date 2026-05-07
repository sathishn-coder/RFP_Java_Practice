package construct.day4.practice;

import java.util.Random;

public class SnakeandLadder {

	// Constants
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {

        Random random = new Random();

        int player1Position = 0;
        int player2Position = 0;

        int diceCount = 0;

        boolean player1Turn = true;

        while (player1Position < 100 && player2Position < 100) {

            int dice = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            diceCount++;

            if (player1Turn) {

                System.out.println("\nPlayer 1 Turn");

                player1Position = playGame(player1Position, dice, option);

                System.out.println("Dice Number : " + dice);
                printOption(option);
                System.out.println("Player 1 Position : " + player1Position);

                // Exact 100 check
                if (player1Position == 100) {
                    System.out.println("\nPlayer 1 Wins the Game!");
                    break;
                }

                // Ladder gets another chance
                if (option != LADDER) {
                    player1Turn = false;
                }

            } else {

                System.out.println("\nPlayer 2 Turn");

                player2Position = playGame(player2Position, dice, option);

                System.out.println("Dice Number : " + dice);
                printOption(option);
                System.out.println("Player 2 Position : " + player2Position);

                // Exact 100 check
                if (player2Position == 100) {
                    System.out.println("\nPlayer 2 Wins the Game!");
                    break;
                }

                // Ladder gets another chance
                if (option != LADDER) {
                    player1Turn = true;
                }
            }
        }

        System.out.println("\nTotal Dice Played : " + diceCount);
    }

    
    public static int playGame(int position, int dice, int option) {

        switch (option) {

            case NO_PLAY:
                break;

            case LADDER:
                position += dice;

             
                if (position > 100) {
                    position -= dice;
                }
                break;

            case SNAKE:
                position -= dice;

             
                if (position < 0) {
                    position = 0;
                }
                break;
        }

        return position;
    }

  
    public static void printOption(int option) {

        switch (option) {

            case NO_PLAY:
                System.out.println("Option : No Play");
                break;

            case LADDER:
                System.out.println("Option : Ladder");
                break;

            case SNAKE:
                System.out.println("Option : Snake");
                break;
        }
    }

}
