package oops.day_11_12.practice;

import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] suits = {
                "Clubs",
                "Diamonds",
                "Hearts",
                "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6",
                "7", "8", "9", "10",
                "Jack", "Queen",
                "King", "Ace"
        };

        String[] deck = new String[52];

        int index = 0;

        // Create Deck
        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] =
                        rank + " of " + suit;
            }
        }

        // Shuffle Deck
        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {

            int randomCard =
                    random.nextInt(deck.length);

            String temp = deck[i];

            deck[i] = deck[randomCard];

            deck[randomCard] = temp;
        }

        // Distribute Cards
        String[][] players =
                new String[4][9];

        int cardIndex = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 9; j++) {

                players[i][j] =
                        deck[cardIndex++];
            }
        }

        // Display Cards
        for (int i = 0; i < 4; i++) {

            System.out.println(
                    "\nPlayer " + (i + 1));

            for (int j = 0; j < 9; j++) {

                System.out.println(players[i][j]);
            }
        }

	}

}
