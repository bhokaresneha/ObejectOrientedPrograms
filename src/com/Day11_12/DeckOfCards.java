/* Problem Statement=>
                        4. Write a Program DeckOfCards.java, to initialize deck of cards having suit("Clubs", "Diamonds", "Hearts", "Spades") &
                         Rank ("2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace").
                         Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards received by
                        the 4 Players using 2D Array...
  * * @author -Sneha Bhokare


 * */
package com.Day11_12;
import java.util.Random;

class DeckOfCards
{
    // Initialization of Array
    String[] suitArray= {"Clubs", "Diamonds", "Hearts", "Spades"};
    String [] rankArray =  {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][]  cardCombination = new String[4][13];
    String[][] player = new String[4][9];


    public void  getCardCombination() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardCombination[i][j] = rankArray[j] + suitArray[i];
                System.out.println("Cards => "+cardCombination[i][j]);
            }
        }

    }

    public void getPlayerArray(){
        int i,j;
       
        for( i=1;i<=4;i++){
            System.out.println("\nPlayers " +(i));
            for(j=0;j<9;j++){
                Random random = new Random();
                // generating random suits and ranks
                int randomSuit = random.nextInt(4);
                int randomRank = random.nextInt(13);
                player[i][j] = cardCombination[randomSuit][randomRank];
                System.out.print(player[i][j]  +  "   \t");

            }

        }
    }
    public static void main (String[]args){
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.getCardCombination();
        deckOfCards.getPlayerArray();

    }

}
